# edu-ma1-mintak-sz3-Flyweight
Mintak - 3. és 4. Szemináriumi gyakorlat


1. Írjunk programot, amely lehetővé teszi, hogy egy szövegszerkesztő esetén az egyes karakterek objektumokként legyenek tárolva. Mivel nagyon sokszor fordulhat elő ugyanaz a betű, azt szeretnénk, hogy minden egyes karakter esetén, a neki megfelelő objektum csak egyszer legyen létrehozva. Ugyanakkor, azt is lehetővé szeretnénk tenni, hogy külső információként az egyes karakterek sajátosságai is elérhetőek legyenek. Például minden egyes esetben le kell lehessen kérdezni és be kell lehessen állítani az adott karakternek megfelelő betűtípust (stílust és méretet), illetve a karakter színét is. Egy adott ablakon belül olvassunk be egy szöveget és írjuk ki, majd a betűtípusra vonatkozó változtatások után írjuk ki újból. A kiíráskor a HTML formátumhoz hasonlóan lehet jelezni a betűtípust és színt. Például: <i>dőlt</i>. Használjuk a Flyweight tervezési mintát (lásd 10 mintak szerkezeti.pdfView in a new window 76.oldal). Plusz pontot lehet kapni, ha a grafikus képernyőn meg is jelenítjük a karaktert, illetve B-fával dolgozunk).