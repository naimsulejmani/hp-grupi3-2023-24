package decision_selection;

import java.util.Scanner;

public class KalkulatoriSwitch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Nr1: ");
        int nr1 = reader.nextInt();
        System.out.print("Nr2: ");
        int nr2 = reader.nextInt();
        System.out.print("Zgjedh operatorin (+,-,*,/,%): ");
        char operator = reader.next().charAt(0);

        switch (operator) {
            case '+' -> System.out.printf("%d + %d = %d%n", nr1, nr2, nr1 + nr2);
            case '-' -> System.out.printf("%d - %d = %d%n", nr1, nr2, nr1 - nr2);
            case '*' -> System.out.printf("%d * %d = %d%n", nr1, nr2, nr1 * nr2);
            case '/' -> System.out.printf("%d / %d = %d%n", nr1, nr2, nr1 / nr2);
            case '%' -> System.out.printf("%d %% %d = %d%n", nr1, nr2, nr1 % nr2);
            default -> System.out.println("Nuk keni zgjedhur operator te duhur.");
        }

    }
}


















