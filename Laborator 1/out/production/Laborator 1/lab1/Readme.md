<p style="color: #2e6c80;" data-darkreader-inline-color=""><a title="Link Laborator 1" href="https://profs.info.uaic.ro/~acf/java/labs/lab_01.html" target="_blank">Link Laborator 1</a></p>
<h1 style="color: #5e9ca0;" data-darkreader-inline-color="">Laborator 1</h1>
<details>
  <summary>Comuplsory (1p)</summary>
  <h2 style="color: #2e6c80;" data-darkreader-inline-color=""><strong>Compulsory</strong>&nbsp;(1p)</h2>
  <h3><strong>"Display on the screen the message "Hello World!". Run the application. If it works, go to step 2"</strong></h3>
  <p>Am utilizat sout + tab pentru a genera System.out.println() dupa care am pus mesajul "Hello World" System.out.println("Hello World");</p>
  <h3><strong>"Define an array of strings languages, containing {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"}"</strong></h3>
  <p>Am creat un vector de String-uri ce contine limbajele de programare.</p>
  <h3><strong>"Generate a random integer n: int n = (int) (Math.random() * 1_000_000)"</strong></h3>
  <p>Am creat o variabila de tip int care se genereaza automat.</p>
  <h3><strong>"Compute the result obtained after performing the following calculations:<br />multiply n by 3, add the binary number 10101 to the result, add the hexadecimal number FF to the result, multiply the result by 6;"</strong></h3>
  <p>Asupra acelei variabile am aplicat aceste calcule, pentru binary si hexadecimal am utilizat Integer.parseInt, se putea utiliza si 0b10101 , 0xFF , dar am zis sa probez!</p>
  <h3><strong>"Compute the sum of the digits in the result obtained in the previous step. This is the new result. While the new result has more than one digit, continue to sum the digits of the result."</strong></h3>
  <p>Am aplicat algoritmul cifrei de control pentru a extrage o cifra, de fiecare data rezultatul va fi 9, iar materia "Java".</p>
  <h2>"Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result]."</h2>
  <p>Va afisa Willy-nilly, this semester I will learn Java, deoarece mereu result va fi egal cu 9.</p>
  <p>&nbsp;</p>
</details>

<details>
  <summary>Homework (2p)</summary>  
  <h2 style="color: #2e6c80;" data-darkreader-inline-color=""><strong>Homework</strong> (2p)</h2>
  <h3><strong>"Let n, p be two integers and C1,...,Cm a set of letters (the alphabet), all given as a command line arguments. Validate the arguments!"</strong></h3>
  <p>Se va introduce din terminal un input, care va fi preluat de String[] args , de exemplu</p>
  <ul>
  <li><code>java Lab1 100 7 A C G T</code>.</li>
  </ul>
  <p>Fiecare pozitie din args va reprezenta un input, n = 100 (args[0]), p=7(args[1]), C1...Cm = "A"(args[2]) "C"(args[3]) "G"(args[4]) "T"(args[5]) etc.<br />Verificam pe rand daca input-ul este valid, la n verificam daca acel String contine doar cifre, la fel si la p. Iar la C-uri verificam daca input-ul este alcatuit doar din litere si apoi daca este o singura litera.</p>
  <h3><strong>"Create an array of n strings (called words), each word containing exactly p characters from the given alphabet. <br /></strong><strong>Display on the screen the generated array."</strong></h3>
  <p>Am creat un vector de String-uri "alphabet" ce va contine tot input-ul C1...Cm.&nbsp;</p>
  <p>Am creat un vector de String-uri "setOfLetters" ce va filtra din input-ul alphabet doar acele input-uri care sunt o singura litera. Se adauga in setOfLetters doar daca acea litera nu exista deja.</p>
  <p>Am creat un vector de String-uri "words" de marime n. Utilizam un for care va itera de p ori, fiecare element din words va primi cuvinte random generate, utilizand literele din "setOfLetters".</p>
  <h3><strong>"Two words are neighbors if they have a common letter. Create a boolean n x n matrix, representing the adjacency relation of the words. <br />Create a data structure (using arrays) that stores the neighbors of each word. Display this data structure on the screen."</strong></h3>
  <p>Pentru a verifica vecinii am creat o matrice tip boolean "adjacency" de marime n x n. Se vor utiliza 4 for-uri :</p>
  <ol>
  <li>Care itereaza de la 0 .. n-1. Este folosit pentru a pargurge fiecare cuvant din "words".</li>
  <li>Face acelasi lucru ca primul for, insa este repetat la fiecare iteratie din primul for.</li>
  <li>Parcurge fiecare litera al cuvantului.</li>
  <li>Pargurce fiecare litera al cuvantului, si verifica cu litera de la for-ul 3 daca sunt egale. Daca da, atunci inseamna ca cele 2 cuvinte sunt vecine.</li>
  </ol>
  <p>Pentru data structure s-a creat un vector de String-uri "neighbours", acesta parcurge fiecare cuvant si prin intermediul unui al 2-lea for ca parcurge de asemenea fiecare cuvant, se verifica vecinii prin intermediul la matricea "adjacency". 
    Daca al 2-lea cuvant este vecin cu primul, se adauga al 2-lea cuvant ca vecin pentru primul in neighbours[i].</p>
</details>

<details>
  <summary>Bonus (2p)</summary>
  <h2 style="color: #2e6c80;" data-darkreader-inline-color="">Bonus (2p)</h2>
  <h3><strong>"Implement an efficient algorithm that determines, if possible, a subset of distinct words W1,W2,...,Wk (from the ones that you have generated) such that k &ge; 3 and Wi and Wi+1 are neighbors, for all i in [1..k], where Wk+1=W1. <br />Can you find the largest possible k?"</strong></h3>
  <p>Mai simplificat, enuntul cere sa se gaseasca cea mai mare secventa de vecini care se afla unul langa altul (k).</p>
  <p>Singura exceptie va fi pentru W(k+1) = W1, unde trebuie sa ne asiguram daca Wk este vecin cu W1 pentru posibilitatea de a exista un k mai mare.</p>
  <p>Asadar avem 3 variabile :</p>
  <ol>
  <li>temporaryLargestPossibleK</li>
  <li>largestPossibleK</li>
  <li>firstPossibleK</li>
  </ol>
  <p>Variabila temporaryLargestPossibleK, va contine cati vecini contine secventa actuala, 1,2,3,...,etc.&nbsp;</p>
  <p>Variabila largestPossibleK, va contine care este secventa cea mai mare de fiecare data cand nu se mai gaseste un vecin, se verifica cu temporaryLargestPossibleK, daca este mai mica atunci se va actualiza valoarea.</p>
  <p>Variabila firstPossibleK, aceasta am gandit-o pentru eficientizare.
  Aici se va stoca secventa de vecini de la primul element.
  De ce? La final vom verifica daca ultimul element este vecin cu primul, iar apoi vom aduna ultimul temporaryLargestPossibleK cu firstPossibleK
  si verificam daca este mai mare decat largestPossibleK.
  Astfel, am eficientizat pentru a nu mai verifica din nou daca exista o secventa de vecini de la primul element.</p>
</details>
