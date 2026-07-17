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

  This is the FIRST entry in a new standing direction: the 16-country
  ISIC-9411 gap discovered at tick 171 (ARE/AUS/CHE/DEU/ESP/FRA/GBR/
  IDN/JPN/MYS/NGA/NOR/PHL/TUR/USA/VNM), all of which already have
  full country + municipality axis coverage but lack a general ISIC
  9411 business/employers confederation entry specifically (though
  several, including Germany, already have OTHER industry-specific
  association entries from earlier Wave-0 work, e.g.
  cloud-itonami-assoc-2910-deu-vda for automotive and
  cloud-itonami-assoc-6419-deu-bankenverband for banking). Germany
  now has real, individually verified facts across ALL THREE axes
  (country: cloud-itonami-iso3166-deu statute.facts, pre-existing;
  municipality: cloud-itonami-municipality-deu-berlin, pre-existing;
  association: this entry, the first ISIC-9411-specific one).

  Both dates directly confirmed. bdi.eu's own official
  '/en/the-bdi/verbandsgeschichte' history page states verbatim: 'On
  19 October 1949 representatives of 32 business associations and
  working groups founded the Ausschuss für Wirtschaftsfragen der
  industriellen Verbände' (BDI's direct predecessor organization,
  renamed to 'BDI' only weeks later, though no exact renaming date is
  given on the official page). Independently corroborated and
  extended by de.wikipedia.org, which additionally states 'Am 1. Juli
  1949 stimmten die Vertreter der Militärregierung der Satzung einer
  solchen Vertretung zu' (on 1 July 1949 the Allied military
  government's representatives approved the statute for such a
  representation) -- a distinct, day-precise, earlier milestone not
  present on BDI's own page.

  An association not in `catalog` has NO spec-basis, full stop; never
  fabricate one.")

(def catalog
  "association-slug -> vector of association-rule entries."
  {"bdi"
   [{:association-rule/id "bdi.statute-approved-1949-07-01"
     :association-rule/title "The Allied military government's representatives approved the statute for a future German industry-wide representation on 1 July 1949"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://de.wikipedia.org/wiki/Bundesverband_der_Deutschen_Industrie"
     :association-rule/url-provenance :wikipedia-corroborated
     :association-rule/established-date "1949-07-01"
     :association-rule/retrieved-at "2026-07-18"
     :association-rule/topic #{:governance}}
    {:association-rule/id "bdi.predecessor-founding-1949-10-19"
     :association-rule/title "32 business associations and working groups founded BDI's direct predecessor, the Ausschuss für Wirtschaftsfragen der industriellen Verbände, on 19 October 1949"
     :association-rule/association "bdi"
     :association-rule/isic "9411"
     :association-rule/country "DEU"
     :association-rule/kind :governance-program
     :association-rule/url "https://bdi.eu/en/the-bdi/verbandsgeschichte"
     :association-rule/url-provenance :official-bdi-eu
     :association-rule/established-date "1949-10-19"
     :association-rule/retrieved-at "2026-07-18"
     :association-rule/topic #{:governance}}]})

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
                 (count (get catalog "bdi")) " BDI entries seeded "
                 "with bdi.eu official history page + de.wikipedia.org corroboration. "
                 "Extend `association.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [association topic]
  (filterv #(contains? (:association-rule/topic %) topic) (spec-basis association)))
