package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class Ligji2INjutonit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj masen e trupit ne kg: ");
        double mass = reader.nextDouble();
        System.out.print("Shkruaj nxitim e trupit ne m/s^2: ");
        double acceleration = reader.nextDouble();
        double force = mass * acceleration;
        System.out.printf("forca eshte e barabarte me %.2f N %n", force);
    }
}
