package decision_selection;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int number = reader.nextInt();

        if (number > 0)
            System.out.println("Numri eshte pozitiv");
        else System.out.println("Numri nuk eshte pozitiv");

        System.out.println("Kjo deklarate gjithmon ekzekutohet");
    }
}













