package operatoret_aritmetik.detyra_shtepie;

import operatoret_aritmetik.SystemOutExample;

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

        System.out.println("-------------------------");
        System.out.printf("1 centshe:  %d   %.2f EUR %n", cent1, cent1 * 0.01);
        System.out.printf("2 centshe:  %d   %.2f EUR %n", cent2, cent2 * 0.02);
        System.out.printf("5 centshe:  %d   %.2f EUR %n", cent5, cent5 * 0.05);
        System.out.printf("10 centshe:  %d   %.2f EUR %n", cent10, cent10 * 0.10);
        System.out.printf("20 centshe:  %d   %.2f EUR %n", cent20, cent20 * 0.20);


    }
}
