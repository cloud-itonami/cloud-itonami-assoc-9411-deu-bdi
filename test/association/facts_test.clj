(ns association.facts-test
  (:require [clojure.string :as str]
            [clojure.test :refer [deftest is]]
            [association.facts :as facts]))

(deftest bdi-has-spec-basis
  (let [sb (facts/spec-basis "bdi")]
    (is (= 2 (count sb)))
    (is (every? #(str/starts-with? (:association-rule/url %) "https://") sb))
    (is (every? #(= "9411" (:association-rule/isic %)) sb))
    (is (every? #(= "DEU" (:association-rule/country %)) sb))))

(deftest unknown-association-has-no-spec-basis
  (is (nil? (facts/spec-basis "bda")))
  (is (nil? (facts/spec-basis "zzz"))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["bdi" "bda"])]
    (is (= 2 (:requested c)))
    (is (= 1 (:covered c)))
    (is (= ["bda"] (:missing-associations c)))))

(deftest by-topic-filters
  (is (= 2 (count (facts/by-topic "bdi" :governance))))
  (is (empty? (facts/by-topic "bdi" :labor)))
  (is (empty? (facts/by-topic "bda" :governance))))
