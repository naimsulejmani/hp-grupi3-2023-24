package decision_selection.detyra_extra;

import java.util.Scanner;

public class ZanoreBashketingellore {
    public static void main(String[] args) {
        final String ZANORET = "aeiouy";
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani nje simbol: ");
        char simboli = reader.next().toLowerCase().charAt(0);
        if (simboli >= 'a' && simboli <= 'z') {
            switch (simboli) {
                case 'a', 'e', 'i', 'o', 'u', 'y' -> System.out.println("Zanore");
                default -> System.out.println("Bashtingellore");
            }
            System.out.println(
                    ZANORET.contains(simboli + "") ? "Zanore" : "Bashketingellore"
            );
        } else {
            System.out.println("Simbol tjeter");
        }
    }
}













