package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

// Adonit Halili
//c^2= a^2 * b^2
//c=sqrt(a^2+ b^2)
public class Hipotenuza {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Sheno vleren e katetes a ne cm: ");
        double a = reader.nextDouble();

        System.out.print("Sheno vleren e katetes b ne cm: ");
        double b = reader.nextDouble();

        //double c = Math.sqrt(a * a + b * b);
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("Vlera e katetes c eshte: %.2fcm%n", c);

    }
}
