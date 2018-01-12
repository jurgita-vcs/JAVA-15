# JAVA-15

1. Parašyti testus Calculator ir Calendar klasėms (junit2)
    1. Naudojant įvairius Assert'us https://github.com/junit-team/junit4/wiki/Assertions
    2. Sukurti testa Exception'ui tikrinti. https://github.com/junit-team/junit4/wiki/Exception-testing
    3. Sukurti parametrizuotą testą. https://github.com/junit-team/junit4/wiki/Parameterized-tests
2. Parašyti testus 14 paskaitos užduočiai (bankomatui).
3. String Calculator (TDD)

Prieš pradedant:
* Neskubėk perskaityti visos užduoties ir užbėgti įvykiams už akių.
* Daryk užduotis po vieną iš eilės.
* Nerašyk testų, nesusijusių su konkrečiomis užduotimis.

4. Sukuti StringCalculator klasę su metodu Add(string numbers)
    1. Metodas gali priimti 0, 1 ar 2 skaičius, ir grazinti sumą (tuščias stringas = 0) pvz: “” or “1” or “1,2”/
    2. Pradėk rašyti testą nuo papraščiausių atvejų empty string, vienas skaičius, du skaičiai ir t.t.
    3. Nepamiršk implementuotį kodą kuo papraščiau.
    4. Nepamiršk refactor žingsnio.
5. Įgalinti add metodą sumuoti neribotą skaičiu skaitmenų.
6. Jei paduodamas neigiamas skaičius, išmetamas IllegalArgumentException. Jei yra daugiau nei vienas neigiamas skaičius, jie išvardinami exception message.
7. Įgalinti add metodą ignuoroti eilutės nukelimą \n.
    1. Validus stringas: “1\n2,3” (grąžins 6)
    2. Nevalidus: “1,\n” (išmes IllegalArgumentException exceptioną).
8. Skaičiai didesni už 1000 ignoruojami pvz.: 2 + 1001 = 2.
