package decision_selection;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int number = reader.nextInt();

        if (number > 0) {
            System.out.println("Numri eshte pozitiv");
            int x = 1;
        }
        System.out.println("Kjo deklarata gjithmon ekzekutohet!");

        if (number < 0)
            number = -number;
        System.out.println(number);
    }
}










