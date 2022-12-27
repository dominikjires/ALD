# ALD Semestrální práce
### Autoři: Dominik Jireš, Matěj Paclt
Program GameMap generuje 2D mapu. Použitý programovací jazyk je Java. Algoritmus náhodně vybírá 1 ze 7 dlaždic uložených v adresáři */data*,
každá dlaždice má velikost 50x50 pixelů. Celkový obraz je složen z 10x10 dlažic o celkové velikosti 500x500 pixelů a je zobrazen pomocí
grafického rozhraní JFrame a JPanel. Algoritmus náhodně vybírá dlaždici a porovnává jí s dlaždicí vlevo a nad (pokud nějaká existuje).
Dlažice jsou porovnávány, zda odpovídají jejich hrany (hrany jsou uloženy v matici *squares* a mají hodnoty 0 a 1). Pokud žádná dlaždice
nevyhovuje, je použit backtracking (tj. generování se vrátí o několik dlaždic zpět). Vygenerované dlaždice jsou jako čísla uloženy do
matice *map* a následně v JPanelu vykresleny. Dlaždice vytvořeny v malování.

### Použité dlaždice:

![Dlaždice 1](/GameMap/data/1.png)
![Dlaždice 2](/GameMap/data/2.png)
![Dlaždice 3](/GameMap/data/3.png)
![Dlaždice 4](/GameMap/data/4.png)
![Dlaždice 5](/GameMap/data/5.png)
![Dlaždice 6](/GameMap/data/6.png)
![Dlaždice 7](/GameMap/data/7.png)

