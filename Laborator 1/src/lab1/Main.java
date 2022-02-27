// Frentescu Cezar-Augustin 2A4
package lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main lab1 = new Main();
        lab1.compulsory();
        String[] fakeArgs = {"10","4","A","B","C","D","E","F","G","H"};
        lab1.homework(fakeArgs);
    }

    void compulsory(){
        //1.Display on the screen the message "Hello World!". Run the application. If it works, go to step 2 :)
        System.out.println("Hello World");

        //2.Define an array of strings languages, containing {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"}
        System.out.println();
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        for (int i = 0; i < languages.length; i++) {
            System.out.print(languages[i] + " ");
        }

        //3.Generate a random integer n: int n = (int) (Math.random() * 1_000_000);
        System.out.println("\n");
        int n = (int) (Math.random() * 1_000_000);
        System.out.println(n + "\n");

        //4.Compute the result obtained after performing the following calculations:
        //multiply n by 3;
        n *= 3;
        //add the binary number 10101 to the result;
        n += Integer.parseInt("10101", 2);
        //add the hexadecimal number FF to the result;
        n += Integer.parseInt("FF", 16);
        //multiply the result by 6;
        n *= 6;
        System.out.println(n + "\n");

        //5.Compute the sum of the digits in the result obtained in the previous step. This is the new result. While the new result has more than one digit, continue to sum the digits of the result.
        int sum = 0;
        int result = 0;

        //do {
        //    while(n!=0) {
        //        sum = sum + n % 10;
        //        n = n / 10;
        //    }
        //    n = sum;
        //    result = sum;
        //    sum = 0;
        //}while(result>=10);

        //n = result;

        while(n>9) // CIFRA DE CONTROL
        {
            n=n/10+n%10;
        }

        System.out.println(n);
        result = n;

        //6.Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result].

        System.out.println("\nWilly-nilly, this semester I will learn " + languages[result]);
    }


    void homework(String[] args){
        // Let n, p be two integers and C1,...,Cm a set of letters (the alphabet), all given as a command line arguments. Validate the arguments!
        int n;
        if(args[0].contains(".") || args[0].contains("-") || args[0].matches("[a-zA-Z]+")){
            System.out.println("The input for the variabile n is invalid");
            return;
        }
        n = Integer.parseInt(args[0]);

        int p;
        if(args[1].contains(".") || args[1].contains("-") || args[1].matches("[a-zA-Z]+")){
            System.out.println("The input for the variabile p is invalid");
            return;
        }
        p = Integer.parseInt(args[1]);

        String[] alphabet = Arrays.copyOfRange(args, 2, args.length);

        ArrayList<String> setOfLetters = new ArrayList<>();
        for (int i = 0; i < alphabet.length; i++) {
            boolean letterFound = false;
            do {
                String letter= alphabet[i];
                if (Character.isLetter(letter.charAt(0))) {
                    if (setOfLetters.contains((letter)) == false) {
                        setOfLetters.add(letter);
                        letterFound = true;
                    }
                } else{
                    System.out.print("The input is not a letter, try again ");
                    return;
                }

            } while (letterFound == false);
        }

        //Create an array of n strings (called words), each word containing exactly p characters from the given alphabet.
        //Display on the screen the generated array.
        ArrayList<StringBuilder> words = new ArrayList<StringBuilder>();
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < p; j++) {
                int k = rand.nextInt(setOfLetters.size());
                word.append(setOfLetters.get(k));
            }
            words.add(word);
        }
        for (int i = 0; i < words.size(); i++)
            System.out.println(words.get(i));

        //Two words are neighbors if they have a common letter.
        //Create a boolean n x n matrix, representing the adjacency relation of the words.
        //Create a data structure (using arrays) that stores the neighbors of each word. Display this data structure on the screen.
        boolean adjacency[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            StringBuilder copyOfWord = words.get(i);
            for (int j = 0; j < n; j++) {
                StringBuilder copyOfNextWord = words.get(j);
                boolean areNeighbours = false;
                for (int t = 0; t < copyOfWord.length() && !areNeighbours; t++) {
                    for (int s = 0; s < copyOfNextWord.length() && !areNeighbours; s++) {
                        if (copyOfWord.charAt(t) == copyOfNextWord.charAt(s))
                            areNeighbours = true;
                    }
                }
                if (areNeighbours)
                    adjacency[i][j] = true;
                else
                    adjacency[i][j] = false;
                areNeighbours = false;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjacency[i][j] + " ");
            }
            System.out.println();
        }
        //Create a data structure (using arrays) that stores the neighbors of each word. Display this data structure on the screen.
        String[] neighbours = new String[n];
        for(int i=0; i<words.size(); i++){
            neighbours[i] = "";
        }

        for(int i=0; i<words.size(); i++){
            for(int j=0; j<adjacency[i].length; j++){
                if(adjacency[i][j] == true && i!=j){
                    neighbours[i] = neighbours[i].concat(words.get(j).toString()).concat(",");
                }
            }
            neighbours[i] = neighbours[i].substring(0,neighbours[i].length()-1); // Removing the last comma
        }

        for(int i=0; i<neighbours.length;i++){
            System.out.println("The neighbours for " + words.get(i) + " are : " + neighbours[i]);
        }


        //Implement an efficient algorithm that determines, if possible, a subset of words W1,W2,...,Wk (from the ones that you have generated) such that k ≥ 3 and Wi and Wi+1 are neighbors, for all i in [1..k], where Wk+1=W1.
        //Can you find the largest possible k?
        int temporaryLargestPossibleK = 1;
        int largestPossibleK = 1;
        int lastPos = 0;
        for(int i=0;i<(n-1);i++){
            if(adjacency[i][i+1] == true)
                temporaryLargestPossibleK++;
            else{
                if (temporaryLargestPossibleK > largestPossibleK)
                    largestPossibleK = temporaryLargestPossibleK;
                temporaryLargestPossibleK = 1;
            }
            lastPos = i+1;
        }
        // We need to check again
        if (temporaryLargestPossibleK > largestPossibleK)
            largestPossibleK = temporaryLargestPossibleK;

        // The same idea for the case W_k+1 = W_1

        boolean ok = true;
        if(largestPossibleK!=n) {
            for(int i=0;i<(n-1) && ok;i++)
            {
                if(adjacency[lastPos][i] == true)
                    temporaryLargestPossibleK++;
                else{
                    if (temporaryLargestPossibleK > largestPossibleK)
                        largestPossibleK = temporaryLargestPossibleK;
                    else
                        ok = false;
                    temporaryLargestPossibleK = 1;
                }
                lastPos=i;
            }
        }
        
        // We need to check again
        if (temporaryLargestPossibleK > largestPossibleK)
            largestPossibleK = temporaryLargestPossibleK;

        // We need to check again
        if (temporaryLargestPossibleK > largestPossibleK)
            largestPossibleK = temporaryLargestPossibleK;

        System.out.println("The largest possible k is : " + largestPossibleK);
    }
}


