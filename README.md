# cloud-itonami-assoc-9411-deu-bdi

Industry rule/history catalog for **BDI** (Bundesverband der Deutschen
Industrie / Federation of German Industries) — the THIRTY-THIRD entry
aligned to **ISIC 9411** (activities of business, employers, and
professional membership organizations), alongside
[`-9411-hnd-cohep`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-hnd-cohep)
(Honduras),
[`-9411-gtm-cacif`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-gtm-cacif)
(Guatemala), and 30 other national industry/employers associations.
Part of the [`cloud-itonami`](https://github.com/cloud-itonami)
compliance-fact family (ADR-2607141700,
`cloud-itonami-compliance-fact-federation`, in `com-junkawasaki/root`).

The **first** entry in a new standing direction: the 16-country
ISIC-9411 gap discovered at tick 171 (ARE/AUS/CHE/DEU/ESP/FRA/GBR/
IDN/JPN/MYS/NGA/NOR/PHL/TUR/USA/VNM), all of which already have full
country + municipality axis coverage but lack a general ISIC 9411
confederation entry specifically (though several, including Germany,
already have OTHER industry-specific association entries, e.g.
[`cloud-itonami-assoc-2910-deu-vda`](https://github.com/cloud-itonami/cloud-itonami-assoc-2910-deu-vda)
for automotive). Germany now has real, individually verified facts
across **all three axes**.

## Sourcing note

Both dates are directly confirmed. `bdi.eu`'s own official history
page confirms the 19 October 1949 founding of BDI's direct
predecessor (the Ausschuss für Wirtschaftsfragen der industriellen
Verbände). Independently corroborated and extended by
`de.wikipedia.org`, which additionally supplies a distinct, day-precise,
earlier milestone: the Allied military government's 1 July 1949
approval of the statute for such a representation.

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on BDI's behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop — never
fabricate one.

## Data

- `src/association/facts.cljc` — the catalog, source of truth.
- `schema/association-rule.edn` — DataScript schema.
- `data/datascript-tx.edn` — derived DataScript tx-data (query this
  alongside other `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`).

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention).
