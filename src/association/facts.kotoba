(ns association.facts
  "Industry rule/history catalog for BDI (Bundesverband der Deutschen
  Industrie / Federation of German Industries) -- a 75th industry-
  association-level source (see cloud-itonami-assoc-9411-sau-fsc,
  -9411-aut-wko, -9411-irl-ibec, -9411-nzl-businessnz, -9411-cze-spcr,
  -9411-ind-cii, -9411-zaf-busa, -9411-bra-cni, -9411-ken-kam,
  -9411-can-chamber, -9411-mex-coparmex, -9411-ita-confindustria,
  -9411-nld-vnoncw, -9411-kor-kcci, -9411-arg-uia, -9411-bel-feb,
  -9411-dnk-di, -9411-swe-sn, -9411-fin-ek, -9411-tha-fti,
  -9411-chl-sofofa, -9411-col-andi, -9411-cri-uccaep, -9411-ecu-cip,
  -9411-egy-fei, -9411-pry-uip, -9411-ury-ciu, -9411-pol-lewiatan,
  -9411-prt-cip, -9411-pan-conep, -9411-gtm-cacif, -9411-hnd-cohep for
  the first thirty-two) per ADR-2607141700 (cloud-itonami-compliance-
  fact-federation). The THIRTY-THIRD entry aligned to ISIC 9411
  (activities of business, employers, and professional membership
  organizations).

  Germany has real, individually verified facts across ALL THREE axes
  (country: cloud-itonami-iso3166-deu statute.facts; municipality:
  cloud-itonami-municipality-deu-berlin; association: this entry, the
  first ISIC-9411-specific one).

  Four voices, six pages. BDI about itself (bdi.eu), the German state's
  own lobby register (lobbyregister.bundestag.de), the European peak
  body BDI belongs to (businesseurope.eu), and an encyclopaedia
  (de.wikipedia.org). Every entry carries the verbatim span it rests on,
  because reachability is not support: a URL that answers 200 and no
  longer says the thing looks exactly like one that does.
  `scripts/verify-catalog.cljs --live` re-reads every span.

  Two entries disagree, and both are kept. BDI's own history page says
  the Ausschuss `wurde nur wenige Wochen später in BDI umbenannt`
  (weeks after 19 October 1949); de.wikipedia.org says `Zu Beginn des
  Jahres 1950`. Neither is discarded and no third date is invented to
  reconcile them -- the disagreement is a fact about the sources, and
  folding it away would be the one edit a reader could not detect.

  An association not in `catalog` has NO spec-basis, full stop; never
  fabricate one.")

(def catalog
  "association-slug -> vector of association-rule entries.

   Derived from data/datascript-tx.edn, which is also the input to
   scripts/gen-kotoba-port.cljs. test/association_facts_kotoba_parity_test.clj
   compares this map to that port field by field, so the two copies cannot
   drift apart without the suite saying so."
  {"bdi"
   [{:association-rule/id "bdi.reichsstand-merger-1933-06-19"
     :association-rule/title "BDI's Weimar-era predecessor was merged into the Reichsstand der Deutschen Industrie on 19 June 1933"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://de.wikipedia.org/wiki/Bundesverband_der_Deutschen_Industrie"
     :association-rule/url-provenance :wikipedia-corroborated
     :association-rule/source-quote "Dieser wurde in der Zeit des Nationalsozialismus am 19. Juni 1933 mit der Vereinigung Deutscher Arbeitgeberverbände am 19. Juni 1933 zum Reichsstand der Deutschen Industrie vereinigt."
     :association-rule/established-date "1933-06-19"
     :association-rule/date-basis :in-quote
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "bdi.statute-approved-1949-07-01"
     :association-rule/title "The Allied military government's representatives approved the statute for a future German industry-wide representation on 1 July 1949"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://de.wikipedia.org/wiki/Bundesverband_der_Deutschen_Industrie"
     :association-rule/url-provenance :wikipedia-corroborated
     :association-rule/source-quote "Am 1. Juli 1949 stimmten die Vertreter der Militärregierung der Satzung einer solchen Vertretung zu."
     :association-rule/established-date "1949-07-01"
     :association-rule/date-basis :in-quote
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "bdi.predecessor-founding-1949-10-19"
     :association-rule/title "32 business associations and working groups founded BDI's direct predecessor, the Ausschuss für Wirtschaftsfragen der industriellen Verbände, on 19 October 1949"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://bdi.eu/en/the-bdi/verbandsgeschichte"
     :association-rule/url-provenance :official-bdi-eu
     :association-rule/source-quote "On 19 October 1949 representatives of 32 business associations and working groups founded the Ausschuss für Wirtschaftsfragen der industriellen Verbände / Committee for Economic Issues of the Industrial Associations at the Excelsior Hotel in Cologne."
     :association-rule/corroborating-url "https://de.wikipedia.org/wiki/Bundesverband_der_Deutschen_Industrie"
     :association-rule/corroborating-provenance :wikipedia-corroborated
     :association-rule/corroborating-quote "Am 19. Oktober 1949, nur eine Woche nach der Gründung des DGB, gründeten daraufhin Vertreter von 32 Wirtschaftsverbänden und Arbeitsgemeinschaften den Ausschuss für Wirtschaftsfragen der industriellen Verbände"
     :association-rule/established-date "1949-10-19"
     :association-rule/date-basis :in-quote
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "bdi.renamed-weeks-after-founding"
     :association-rule/title "BDI's own history page dates the rename from Ausschuss to BDI only as a few weeks after the founding"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://bdi.eu/en/the-bdi/verbandsgeschichte"
     :association-rule/url-provenance :official-bdi-eu
     :association-rule/source-quote "wurde nur wenige Wochen später in „BDI“ umbenannt"
     :association-rule/date-unknown-because :official-page-says-only-a-few-weeks-later
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "bdi.renamed-beginning-of-1950"
     :association-rule/title "The encyclopaedia places the rename to Bundesverband der Deutschen Industrie at the beginning of 1950, later than BDI's own few-weeks account"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://de.wikipedia.org/wiki/Bundesverband_der_Deutschen_Industrie"
     :association-rule/url-provenance :wikipedia-corroborated
     :association-rule/source-quote "Zu Beginn des Jahres 1950 wurde der Verein in Bundesverband der Deutschen Industrie umbenannt."
     :association-rule/established-date "1950"
     :association-rule/date-basis :in-quote
     :association-rule/date-not-narrowed-because :source-says-only-the-beginning-of-the-year
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "bdi.cologne-headquarters-1950-1999"
     :association-rule/title "BDI's headquarters stood in the Haus der Deutschen Industrie in Cologne between 1950 and 1999"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://de.wikipedia.org/wiki/Bundesverband_der_Deutschen_Industrie"
     :association-rule/url-provenance :wikipedia-corroborated
     :association-rule/source-quote "Zwischen 1950 und 1999 befand sich der Hauptsitz des BDI im Haus der Deutschen Industrie in Köln"
     :association-rule/date-unknown-because :source-states-a-period-not-an-event-date
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:contact :governance}}
    {:association-rule/id "bdi.brussels-office-opened-2016-02"
     :association-rule/title "BDI opened its new Brussels office in February 2016"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://bdi.eu/en/the-bdi/verbandsgeschichte"
     :association-rule/url-provenance :official-bdi-eu
     :association-rule/source-quote "When the BDI opened the new Brussels office in February 2016 it was primarily a completely new space."
     :association-rule/established-date "2016-02"
     :association-rule/date-basis :in-quote
     :association-rule/date-not-narrowed-because :source-names-the-month-not-the-day
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:european-representation}}
    {:association-rule/id "bdi.president-leibinger-2025-01-01"
     :association-rule/title "Peter Leibinger succeeded Siegfried Russwurm as BDI president on 1 January 2025"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://bdi.eu/en/the-bdi/verbandsgeschichte"
     :association-rule/url-provenance :official-bdi-eu
     :association-rule/source-quote "tritt Leibinger am 1. Januar 2025 die Nachfolge von Siegfried Russwurm"
     :association-rule/corroborating-url "https://www.lobbyregister.bundestag.de/suche/R000534"
     :association-rule/corroborating-provenance :german-lobbyregister
     :association-rule/corroborating-quote "Vertretungsberechtigte Person(en): Dr.-Ing. E.h. Peter Leibinger Funktion: Präsident"
     :association-rule/established-date "2025-01-01"
     :association-rule/date-basis :in-quote
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "bdi.membership-scale-100000-companies"
     :association-rule/title "BDI states it speaks for more than 100,000 companies employing more than eight million people"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :membership
     :association-rule/url "https://bdi.eu/en/the-bdi/ueber-uns"
     :association-rule/url-provenance :official-bdi-eu
     :association-rule/source-quote "more than 100,000 large, medium-sized and small companies from all sectors of the manufacturing industry, which together employ more than eight million people."
     :association-rule/date-unknown-because :self-description-carries-no-date
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:membership}}
    {:association-rule/id "bdi.industry-share-of-gdp"
     :association-rule/title "BDI states that just under a quarter of Germany's GDP is generated by German industry"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :membership
     :association-rule/url "https://bdi.eu/en/the-bdi/ueber-uns"
     :association-rule/url-provenance :official-bdi-eu
     :association-rule/source-quote "Just under a quarter of Germany's gross domestic product (GDP) is generated by German industry."
     :association-rule/date-unknown-because :self-description-carries-no-date
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:economic-weight}}
    {:association-rule/id "bdi.lobbyregister-r000534-2022-02-16"
     :association-rule/title "BDI is entered in the German Bundestag lobby register as R000534, an eingetragener Verein, first registered on 16 February 2022"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.lobbyregister.bundestag.de/suche/R000534"
     :association-rule/url-provenance :german-lobbyregister
     :association-rule/source-quote "Bundesverband der Deutschen Industrie e.V. Eingetragener Verein (e. V.) Registernummer: R000534 Ersteintrag: 16.02.2022"
     :association-rule/established-date "2022-02-16"
     :association-rule/date-basis :in-quote-numeric-dmy
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance :registration :transparency}}
    {:association-rule/id "bdi.lobbyregister-address-breite-str-29"
     :association-rule/title "BDI's registered address is Breite Str. 29, 10178 Berlin"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :membership
     :association-rule/url "https://www.lobbyregister.bundestag.de/suche/R000534"
     :association-rule/url-provenance :german-lobbyregister
     :association-rule/source-quote "Adresse: Breite Str. 29 10178 Berlin Deutschland"
     :association-rule/corroborating-url "https://www.businesseurope.eu/member/bundesverband-der-deutschen-industrie-e-v-bdi/"
     :association-rule/corroborating-provenance :peak-body-businesseurope
     :association-rule/corroborating-quote "Bundesverband der Deutschen Industrie e.V. – BDI Breite Strasse, 29 D-10178 Berlin"
     :association-rule/date-unknown-because :register-field-carries-no-date
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:contact :registration}}
    {:association-rule/id "bdi.lobbyregister-expenditure-2025"
     :association-rule/title "BDI declared annual lobbying expenditure of 9,550,001 to 9,560,000 euro for the financial year 01/25 to 12/25"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.lobbyregister.bundestag.de/suche/R000534"
     :association-rule/url-provenance :german-lobbyregister
     :association-rule/source-quote "Jährliche finanzielle Aufwendungen im Bereich der Interessenvertretung: Geschäftsjahr: 01/25 bis 12/25 9.550.001 bis 9.560.000 Euro"
     :association-rule/date-unknown-because :entry-states-a-reporting-period-not-an-event-date
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:transparency}}
    {:association-rule/id "bdi.lobbyregister-fte-2025"
     :association-rule/title "BDI declared 38.75 full-time equivalents engaged in interest representation for the financial year 01/25 to 12/25"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.lobbyregister.bundestag.de/suche/R000534"
     :association-rule/url-provenance :german-lobbyregister
     :association-rule/source-quote "Vollzeitäquivalent der im Bereich der Interessenvertretung beschäftigten Personen: Geschäftsjahr: 01/25 bis 12/25 38,75"
     :association-rule/date-unknown-because :entry-states-a-reporting-period-not-an-event-date
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:transparency}}
    {:association-rule/id "bdi.businesseurope-member"
     :association-rule/title "BDI is listed by BusinessEurope as one of its two German member federations"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :membership
     :association-rule/url "https://www.businesseurope.eu/members"
     :association-rule/url-provenance :peak-body-businesseurope
     :association-rule/source-quote "Bundesverband der Deutschen Industrie e.V. – BDI Germany"
     :association-rule/date-unknown-because :directory-listing-carries-no-date
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:european-representation :membership}}
    {:association-rule/id "bdi.brussels-representation-address"
     :association-rule/title "BDI Representation Brussels sits at Rue Marie de Bourgogne 58, 1000 Bruxelles"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :membership
     :association-rule/url "https://www.businesseurope.eu/member/bundesverband-der-deutschen-industrie-e-v-bdi/"
     :association-rule/url-provenance :peak-body-businesseurope
     :association-rule/source-quote "Brussels office BDI Representation Brussels Rue Marie de Bourgogne, 58 1000 Bruxelles"
     :association-rule/date-unknown-because :directory-entry-carries-no-date
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:european-representation :contact}}]})

(defn spec-basis [association] (get catalog association))

(defn coverage
  ([] (coverage (keys catalog)))
  ([associations]
   (let [have (filter catalog associations)
         missing (remove catalog associations)]
     {:requested (count associations)
      :covered (count have)
      :covered-associations (vec (sort have))
      :missing-associations (vec (sort missing))
      :note (str "cloud-itonami-assoc-9411-deu-bdi Wave 0 (ADR-2607141700): "
                 (count (get catalog "bdi")) " BDI entries, each citing a source "
                 "with the page and the verbatim span it rests on, across four "
                 "voices: BDI itself, the German Bundestag lobby register, the "
                 "European peak body, and an encyclopaedia. Extend "
                 "`association.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [association topic]
  (filterv #(contains? (:association-rule/topic %) topic) (spec-basis association)))

(defn sources
  "Distinct pages this catalog rests on, with the entries each carries.
   A catalog that cites one page is one redesign away from citing none;
   this is the number that says how exposed it is."
  ([] (sources "bdi"))
  ([association]
   (->> (spec-basis association)
        (group-by :association-rule/url)
        (reduce-kv (fn [m url es] (assoc m url (mapv :association-rule/id es))) {}))))

(defn undated
  "Entries that carry no date, with the reason the source gives none.
   Being undated is a fact about the source and is recorded, not hidden."
  ([] (undated "bdi"))
  ([association]
   (->> (spec-basis association)
        (filterv #(nil? (:association-rule/established-date %)))
        (mapv (juxt :association-rule/id :association-rule/date-unknown-because)))))

(defn corroborated
  "Entries a second, independent page also states, as
   id -> [primary-host corroborating-host]. A fact two voices carry
   survives one of them being rewritten; this names which ones do."
  ([] (corroborated "bdi"))
  ([association]
   (->> (spec-basis association)
        (filterv :association-rule/corroborating-url)
        (reduce (fn [m e]
                  (assoc m (:association-rule/id e)
                         [(:association-rule/url-provenance e)
                          (:association-rule/corroborating-provenance e)]))
                {}))))
