(ns association.facts-test
  (:require [clojure.set :as set]
            [clojure.string :as str]
            [clojure.test :refer [deftest is testing]]
            [association.facts :as facts]))

(def ^:private entries (facts/spec-basis "bdi"))

(deftest bdi-has-spec-basis
  (is (= 16 (count entries)))
  (is (every? #(str/starts-with? (:association-rule/url %) "https://") entries))
  (is (every? #(= "9411" (:association-rule/isic %)) entries))
  (is (every? #(= "DEU" (:association-rule/country %)) entries))
  (is (= (count entries) (count (distinct (map :association-rule/id entries))))
      "a duplicated id would silently shadow an entry in any map keyed by it"))

(deftest every-entry-carries-the-span-it-rests-on
  ;; Reachability is not support. A URL that answers 200 and no longer states
  ;; the claim looks exactly like one that does, so the quote is what makes
  ;; `scripts/verify-catalog.cljs --live` able to tell those two apart.
  (doseq [e entries]
    (testing (:association-rule/id e)
      (is (string? (:association-rule/source-quote e)))
      (is (<= 12 (count (:association-rule/source-quote e)))
          "a span this short can be found on a page that is not serving the claim"))))

(deftest a-date-says-where-it-came-from-and-a-missing-one-says-why
  ;; An invented date and an honestly-absent one must not look alike.
  (doseq [e entries]
    (testing (:association-rule/id e)
      (if (:association-rule/established-date e)
        (is (some? (:association-rule/date-basis e)))
        (is (some? (:association-rule/date-unknown-because e)))))))

(deftest provenance-matches-the-host-it-claims
  ;; The keyword asserts WHO is speaking; only the URL's host corroborates it.
  (let [host->prov {"bdi.eu" :official-bdi-eu
                    "www.lobbyregister.bundestag.de" :german-lobbyregister
                    "www.businesseurope.eu" :peak-body-businesseurope
                    "de.wikipedia.org" :wikipedia-corroborated}]
    (doseq [e entries]
      (testing (:association-rule/id e)
        (let [host (second (re-find #"^https://([^/]+)" (:association-rule/url e)))]
          (is (= (host->prov host) (:association-rule/url-provenance e))))))))

(deftest corroboration-is-all-three-fields-or-none
  ;; Two of three is a citation this repo cannot check but a reader would believe.
  (doseq [e entries]
    (testing (:association-rule/id e)
      (let [present (remove nil? [(:association-rule/corroborating-url e)
                                  (:association-rule/corroborating-provenance e)
                                  (:association-rule/corroborating-quote e)])]
        (is (contains? #{0 3} (count present)))))))

(deftest the-catalog-does-not-rest-on-one-page
  ;; A catalog citing one page is one redesign away from citing none.
  (let [s (facts/sources)]
    (is (= 6 (count s)) "six pages carry the primary citations")
    (is (= (count entries) (reduce + (map count (vals s))))
        "every entry is accounted for in exactly one source bucket")))

(deftest undated-entries-name-their-reason
  (let [u (facts/undated)]
    (is (= 9 (count u)))
    (is (every? (comp keyword? second) u)
        "an undated entry with a nil reason is a forgotten date wearing an honest face")))

(deftest corroborated-entries-cross-two-voices
  (let [c (facts/corroborated)]
    (is (= 3 (count c)))
    (doseq [[id [primary corroborating]] c]
      (testing id
        (is (not= primary corroborating)
            "a second citation from the same voice is not corroboration")))))

(deftest the-two-sources-disagree-about-the-rename-and-both-are-kept
  ;; BDI says weeks after October 1949; the encyclopaedia says the beginning of
  ;; 1950. Folding this away would be the one edit a reader could not detect.
  (let [by-id (into {} (map (juxt :association-rule/id identity)) entries)
        official (by-id "bdi.renamed-weeks-after-founding")
        encyclopaedia (by-id "bdi.renamed-beginning-of-1950")]
    (is (some? official))
    (is (some? encyclopaedia))
    (is (nil? (:association-rule/established-date official)))
    (is (= "1950" (:association-rule/established-date encyclopaedia)))
    (is (not= (:association-rule/url-provenance official)
              (:association-rule/url-provenance encyclopaedia)))))

(deftest unknown-association-has-no-spec-basis
  (is (nil? (facts/spec-basis "bda")))
  (is (nil? (facts/spec-basis "zzz"))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["bdi" "bda"])]
    (is (= 2 (:requested c)))
    (is (= 1 (:covered c)))
    (is (= ["bda"] (:missing-associations c)))))

(deftest by-topic-filters
  (is (= 8 (count (facts/by-topic "bdi" :governance))))
  (is (= 3 (count (facts/by-topic "bdi" :transparency))))
  (is (= 3 (count (facts/by-topic "bdi" :european-representation))))
  (is (empty? (facts/by-topic "bdi" :labor)))
  (is (empty? (facts/by-topic "bda" :governance)))
  (is (= (set (mapcat :association-rule/topic entries))
         (set/union #{:governance :contact :european-representation :membership}
                    #{:economic-weight :registration :transparency}))
      "a topic added to the data without a name here is an index nobody queries"))
