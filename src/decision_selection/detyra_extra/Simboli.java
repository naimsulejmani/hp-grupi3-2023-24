package decision_selection.detyra_extra;

import java.util.Scanner;

public class Simboli {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani nje nga simbolet e ASCII-te: ");
        char simboli = reader.next().charAt(0);

        if (simboli >= 'a' && simboli <= 'z') {
            System.out.println("Shkronje e vogel");
        } else if (simboli >= 'A' && simboli <= 'Z') {
            System.out.println("Shkronje e madhe");
        } else if (simboli >= '0' && simboli <= '9') {
            System.out.println("Numer");
        } else {
            System.out.println("As shkronje po as numer!");
        }
    }
}














