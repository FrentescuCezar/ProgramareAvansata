package main;

import main.Main;

public class SecondMain {
    public static void main(String[] args) {
        // o variabila statica se va folosi ca proprietate comuna a tuturor obiectelor
        System.out.println("Acesta este cel de-al doilea main!");
        //String[] str = new String[20];
        //main.Main.main(str); // metoda este statica; va afisa tot ce se afla in package-ul main

        main.Main.main(new String[20]); // in loc sa facem un obiect str
    }
}
