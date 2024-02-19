<h4><h3>Celem Workshop2 jest przetrenowanie i przetestowanie zasad DAO.</h3>

Utworzona została klasa <b><i>User</i></b>, która odpowiada tabeli <b><i>user</i></b> z bazy danych. 
Klasa ta posiada argumenty odpowiadające kolumnom tabeli <b><i>user</i></b>.
<br><br>
Druga z klas (<b><i>userDao</i></b>) zawiera nastepujące metody operujące na rekordach w tabeli <b><i>user</i></b>:
<ol>
<li><b><i>create</i></b> - dodaje nowy rekord</li>
<li><b><i>delete</i></b>- usuwa konkretny rekord</li>
<li><b><i>update</i></b> - modyfikuje wybrany rekord</li>
<li><b><i>read</i></b>- odczytuje jeden rekord</li>
<li><b><i>findAll</i></b> - odczytuje wszystkie rekordy</li>
</ol>

<h3>Dokładny opis metod.</h3>

1. Zostaje utworzony obiekt klasy <b><i>User</i></b>, którego zawartość zostaje dodana to tabeli <b><i>user</i></b>.
Dodatkowo zawartośc argumentu password przed dodaniem zostaje zahaszowana.
Nastepnie do tego obiektu zostaje dodana wartość identyfikatora <b><i>id</i></b>, która jest generowana w tabeli <b><i>user</i></b>.
<br>
2. W tabeli <b><i>user</i></b> zostaje usunięty rekord o zadanym <b><i>id</i></b>.
<br>
3. W tabeli <b><i>user</i></b> zostaje zmodyfikowany rekord o zadanym <b><i>id</i></b>.
<br>
4. Zostaje utworzony obiekt klasy <b><i>User</i></b>, którego argumenty przyjmują wartości odczytane z tabeli <b><i>user</i></b> na podstawie zadanego <b><i>id</i></b>.
<br>
5. Zostaje utworzona tablica obiektów klasy <b><i>User</i></b>. Obiekty te przyjmują wartości wszystkich rekordów z tabeli <b><i>user</i></b>.
Tablica ma rozmiar odpowiadający ilości rekordów zawartych w tabeli <b><i>user</i></b>.
<br><br>
Dodatkowo, celem przetestowania działania metod, zostają utworzone dodatkowe klasy zaczynające się od słowa "Main".
</h4>

