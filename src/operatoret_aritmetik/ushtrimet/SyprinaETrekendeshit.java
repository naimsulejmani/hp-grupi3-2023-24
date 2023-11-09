package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

// endri begaj
public class SyprinaETrekendeshit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj height e trekendshit: ");

        double height = reader.nextDouble();

        System.out.print("Shkruaj baza e trekendshit: ");
        double base = reader.nextDouble();
        double area = height * base / 2;

        System.out.printf("Syprina e trekendshit eshte %.3f m^2%n", area);


    }
}















