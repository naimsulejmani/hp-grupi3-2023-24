package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

// Hyrie Sinidolli
public class PerimetriIKatrorit {
    // p=4*a
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj gjatesine e brinjes se katrorit: ");
        double side = reader.nextDouble();
        double perimeter = 4 * side;
        System.out.printf("Perimetri i Katrorit eshte %.2f%n", perimeter);
    }
}













