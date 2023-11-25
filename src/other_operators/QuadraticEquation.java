package other_operators;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Shkruaj a = ");
        double a = scan.nextDouble();

        System.out.print("Shkruaj b = ");
        double b = scan.nextDouble();

        System.out.print("Shkruaj c = ");
        double c = scan.nextDouble();

        double d = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + d) / (2 * a);
        double x2 = (-b - d) / (2 * a);

        System.out.printf("x1 = %.2f%n", x1);
        System.out.printf("x2 = %.2f%n", x2);


    }
}












