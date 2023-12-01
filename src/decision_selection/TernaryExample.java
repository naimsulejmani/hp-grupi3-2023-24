package decision_selection;

import java.util.Scanner;

public class TernaryExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Paga minimale");
        System.out.println("Shkruaj sa vjet i keni: ");
        int age = reader.nextInt();
        double minSalary;

        if (age >= 30) {
            minSalary = 170;
        } else {
            minSalary = 130;
        }

        minSalary = age >= 30 ? 170 : 130; // operatori ternar forme e shkurtuar e IF-it
        System.out.println("Paga eshte: " + minSalary);

        System.out.println(age >= 18 ? "Keni drejte me ble duhan" : "Nuk keni drejte");
    }
}

















