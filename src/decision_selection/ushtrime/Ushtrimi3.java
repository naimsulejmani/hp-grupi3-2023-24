package decision_selection.ushtrime;

import java.util.Scanner;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj sasine: ");
        double quantity = reader.nextDouble();
        final double PRICE = 100.0;
        double cost = quantity * PRICE;

        System.out.printf("Sasia:   %20.2f%n", quantity);
        System.out.printf("Cmimi:   %20.2f EUR%n", PRICE);
        System.out.printf("Cost:    %20.2f EUR%n", cost);

        if (cost >= 1000) {
            double discount = cost * 0.10;// 0.01, 0.02, 0.5...
            double forPayment = cost - discount;
            System.out.printf("Zbritja: %20.2f EUR%n", discount);
            System.out.printf("Totali:  %20.2f EUR%n", forPayment);
        } else {
            System.out.printf("Zbritja: %20.2f EUR%n", 0.0);
            System.out.printf("Totali:  %20.2f EUR%n", cost);
        }
    }
}















