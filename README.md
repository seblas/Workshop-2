<h4><h3>Celem Workshop2 jest przetrenowanie i przetestowanie zasad DAO.</h3>

Utworzona została klasa **_User_**, która odpowiada tabeli **_user_** z bazy danych. 
Klasa ta posiada argumenty odpowiadające kolumnom tabeli **_user_**.
<br><br>
Druga z klas (**_userDao_**) zawiera nastepujące metody operujące na rekordach w tabeli user:
<ol>
<li>create - dodaje nowy rekord</li>
<li>delete - usuwa konkretny rekord</li>
<li>update - modyfikuje wybrany rekord</li>
<li>read - odczytuje jeden rekord</li>
<li>findAll - odczytuje wszystkie rekordy</li>
</ol>

<h3>Dokładny opis metod.</h3>

1. Zostaje utworzony obiekt klasy **_User_**, którego zawartość zostaje dodana to tabeli **_user_**.
Dodatkowo zawartośc argumentu password przed dodaniem zostaje zahaszowana.
Nastepnie do tego obiektu zostaje dodana wartość identyfikatora **_id_**, która jest generowana w tabeli **_user_**.
<br>
2. W tabeli **_user_** zostaje usunięty rekord o zadanym **_id_**.
<br>
3. W tabeli **_user_** zostaje zmodyfikowany rekord o zadanym **_id_**.
<br>
4. Zostaje utworzony obiekt klasy **_User_**, którego argumenty przyjmują wartości odczytane z tabeli **_user_** na podstawie zanadego **_id_**.
<br>
5. Zostaje utworzona tablica obiektów klasy **User**. Obiekty te przyjmują wartości wszystkich rekordów z tabeli **user**.
Tablica ma rozmiar odpowiadający ilości rekordów zawartych w tabeli **user**.
<br><br>
Dodatkowo, celem przetestowania działania metod, zostają utworzone dodatkowe klasy zaczynające się od słowa "Main".
</h4>

