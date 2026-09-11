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

Germany has real, individually verified facts across **all three axes**
(country: `cloud-itonami-iso3166-deu`; municipality:
`cloud-itonami-municipality-deu-berlin`; association: this entry, the
first ISIC-9411-specific one).

## Sourcing

**16 entries, four voices, six pages.** Every entry carries the verbatim
span at its URL that it rests on, because *reachability is not support*:
a page that answers 200 and no longer states the claim looks exactly like
one that does.

| Voice | Host | What it is |
|---|---|---|
| `:official-bdi-eu` | `bdi.eu` | BDI about itself |
| `:german-lobbyregister` | `lobbyregister.bundestag.de` | the German state's own lobby register (R000534) |
| `:peak-body-businesseurope` | `businesseurope.eu` | the European peak body BDI belongs to |
| `:wikipedia-corroborated` | `de.wikipedia.org` | an encyclopaedia |

Three entries are stated independently by a second voice
(`association.facts/corroborated`). Nine carry no date, each naming why
its source gives none (`association.facts/undated`) — an invented date
and an honestly-absent one must not look alike.

**Two entries disagree, and both are kept.** BDI's own history page dates
the rename from *Ausschuss für Wirtschaftsfragen der industriellen
Verbände* to *BDI* as `nur wenige Wochen später` (weeks after 19 October
1949); `de.wikipedia.org` says `Zu Beginn des Jahres 1950`. Neither is
discarded and no third date is invented to reconcile them — the
disagreement is a fact about the sources, and folding it away would be
the one edit a reader could not detect.

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on BDI's behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop — never
fabricate one.

## Checking it

```bash
kbb --backend sci scripts/verify-catalog.cljk           # structural only, offline
kbb --backend sci scripts/verify-catalog.cljk --live    # re-read every span at its source
kbb --backend sci scripts/gen-kotoba-port.cljk --check  # is the Kotoba port what the data says?
kbb -M:test                           # .cljc vs .kotoba, field by field
```

`verify-catalog.cljs` exits **0** checked and clean, **1** checked with
findings, **2** REFUSED — it could not read the sources, which must not
leave the same trace as reading them and finding nothing wrong.

## Data

- `data/datascript-tx.edn` — the catalog, and the input to the generator
  and the verifier.
- `src/association/facts.cljc` — the same catalog as Clojure data, plus
  `spec-basis` / `coverage` / `by-topic` / `sources` / `undated` /
  `corroborated`.
- `src/association_facts.kotoba` — **generated**; reaches the Kotoba
  oracle, wasm and both native ISAs, which the `.cljc` cannot. Do not
  hand-edit; run `scripts/gen-kotoba-port.cljs`.
- `schema/association-rule.edn` — DataScript schema. Query this alongside
  other `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`.

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention).
