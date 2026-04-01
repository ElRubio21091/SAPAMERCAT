Estructura del projecte

- `Producte` (classe abstracta)
- `Alimentacio`
- `Textil`
- `Electronica`
- `CarretCompra`
- `Tiquet`
- `Main`

---

## Decisions de disseny

###  Ús de Map
S'ha utilitzat una estructura `Map<Producte, Integer>` per representar el carret:
- Clau → Producte
- Valor → Quantitat