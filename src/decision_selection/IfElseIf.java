package decision_selection;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int number = reader.nextInt();

        if (number > 0)
            System.out.println("Numri eshte pozitiv");
        else if (number < 0) {
            System.out.println("Numri eshte negative");
            int x = 10;
            System.out.println(x);
        } else System.out.println("Numri eshte 0");

        System.out.println("Kjo deklarate gjithmon ekzekutohet");
    }
}
