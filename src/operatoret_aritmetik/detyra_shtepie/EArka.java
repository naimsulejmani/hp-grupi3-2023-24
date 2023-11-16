package operatoret_aritmetik.detyra_shtepie;

import operatoret_aritmetik.SystemOutExample;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class EArka {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruaj sa 1 centsh i keni: ");
        int cent1 = reader.nextInt();
        System.out.print("Shkruaj sa 2 centsh i keni: ");
        int cent2 = reader.nextInt();
        System.out.print("Shkruaj sa 5 centsh i keni: ");
        int cent5 = reader.nextInt();
        System.out.print("Shkruaj sa 10 centsh i keni: ");
        int cent10 = reader.nextInt();
        System.out.print("Shkruaj sa 20 centsh i keni: ");
        int cent20 = reader.nextInt();
        System.out.print("Shkruaj sa 50 centsh i keni: ");
        int cent50 = reader.nextInt();
        System.out.print("Shkruaj sa 1 euro i keni: ");
        int euro1 = reader.nextInt();
        System.out.print("Shkruaj sa 2 euro i keni: ");
        int euro2 = reader.nextInt();
        System.out.print("Shkruaj sa 5 euro i keni: ");
        int euro5 = reader.nextInt();
        System.out.print("Shkruaj sa 10 euro i keni: ");
        int euro10 = reader.nextInt();
        System.out.print("Shkruaj sa 20 euro i keni: ");
        int euro20 = reader.nextInt();
        System.out.print("Shkruaj sa 50 euro i keni: ");
        int euro50 = reader.nextInt();
        System.out.print("Shkruaj sa 100 euro i keni: ");
        int euro100 = reader.nextInt();
        System.out.print("Shkruaj sa 200 euro i keni: ");
        int euro200 = reader.nextInt();
        System.out.print("Shkruaj sa 500 euro i keni: ");
        int euro500 = reader.nextInt();


        System.out.println("-------------------------------------------");
        System.out.printf("1 centshe:     %6d   %10.2f EUR %n", cent1, cent1 * 0.01);
        System.out.printf("2 centshe:     %6d   %10.2f EUR %n", cent2, cent2 * 0.02);
        System.out.printf("5 centshe:     %6d   %10.2f EUR %n", cent5, cent5 * 0.05);
        System.out.printf("10 centshe:    %6d   %10.2f EUR %n", cent10, cent10 * 0.10);
        System.out.printf("20 centshe:    %6d   %10.2f EUR %n", cent20, cent20 * 0.20);
        System.out.printf("50 centshe:    %6d   %10.2f EUR %n", cent50, cent50 * 0.50);
        System.out.printf("1 euroshe:     %6d   %10.2f EUR %n", euro1, euro1 * 1.00);
        System.out.printf("2 euroshe:     %6d   %10.2f EUR %n", euro2, euro2 * 2.00);
        System.out.printf("5 euroshe:     %6d   %10.2f EUR %n", euro5, euro5 * 5.00);
        System.out.printf("10 euroshe:    %6d   %10.2f EUR %n", euro10, euro10 * 10.0);
        System.out.printf("20 euroshe:    %6d   %10.2f EUR %n", euro20, euro20 * 20.0);
        System.out.printf("50 euroshe:    %6d   %10.2f EUR %n", euro50, euro50 * 50.0);
        System.out.printf("100 euroshe:   %6d   %10.2f EUR %n", euro100, euro100 * 100.0);
        System.out.printf("200 euroshe:   %6d   %10.2f EUR %n", euro200, euro200 * 200.0);
        System.out.printf("500 euroshe:   %6d   %10.2f EUR %n", euro500, euro500 * 500.0);


        System.out.println("-------------------------------------------");
        double total = cent1 * 0.01 + cent2 * 0.02 + cent5 * 0.05
                + cent10 * 0.10 + cent20 * 0.20 + cent50 * 0.50
                + euro1 * 1.00 + euro2 * 2.00
                + euro5 * 5.00 + euro10 * 10.0 + euro20 * 20.0 + euro50 * 50.0
                + euro100 * 100.0 + euro200 * 200.0 + euro500 * 500.0;

        System.out.printf("Totali: %25.2f EUR %n", total);
        System.out.println("-------------------------------------------");
        System.out.printf("Data:   %27s %n", LocalDate.now());
        System.out.println("-------------------------------------------");


    }
}






