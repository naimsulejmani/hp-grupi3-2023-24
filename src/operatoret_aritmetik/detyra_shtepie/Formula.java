package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj a = ");
        double a = reader.nextDouble();
        System.out.print("Shkruaj b = ");
        double b = reader.nextDouble();
        System.out.print("Shkruaj c = ");
        double c = reader.nextDouble();
        System.out.print("Shkruaj d = ");
        double d = reader.nextDouble();
        System.out.print("Shkruaj e = ");
        double e = reader.nextDouble();
        System.out.print("Shkruaj x = ");
        double x = reader.nextDouble();

        double m = (a + b + c + d + e) / (a * Math.pow(x, e - 1) )
                - Math.sqrt(Math.pow(a + b * c, 3));
        System.out.printf("Rezultati eshte i barabarte me %.2f%n",m);


    }
}














