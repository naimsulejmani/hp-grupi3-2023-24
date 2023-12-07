package decision_selection.detyrat;

import java.util.Scanner;

public class Kalkulatori {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numri e pare: ");
        int nr1 = reader.nextInt();
        System.out.print("Shkruaj numrine dyte: ");
        int nr2 = reader.nextInt();
        System.out.println("Shkruaj operatorin (+,-,*,/,%)");
        char operator = reader.next().charAt(0);
        if (operator == '+') {
            System.out.printf("%d + %d = %d %n", nr1, nr2, nr1 + nr2);
        } else if (operator == '-') {
            System.out.printf("%d - %d = %d %n", nr1, nr2, nr1 - nr2);
        } else if (operator == '*') {
            System.out.printf("%d * %d = %d %n", nr1, nr2, nr1 * nr2);
        } else if (operator == '/') {
            if (nr2 != 0) {
                System.out.printf("%d / %d = %d %n", nr1, nr2, nr1 / nr2);
            } else {
                System.out.println("Nuk lejohet pjesetimi me zero. ");
            }
        } else if (operator == '%') {
            if (nr2 != 0)
                System.out.printf("%d %% %d = %d %n", nr1, nr2, nr1 % nr2);
            else System.out.println("Nuk lejohet pjesetimi me zero. ");
        } else {
            System.out.println("Nuk keni dhene operatorin e duhur");
        }
    }
}














