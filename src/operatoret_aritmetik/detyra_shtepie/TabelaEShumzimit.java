package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

public class TabelaEShumzimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin: ");
        int numri = reader.nextInt();

        System.out.printf("Tabela e shumzimit me %d:%n", numri);

        System.out.println("-------------------------------------------");
        System.out.printf("1        x   %6d    =   %7d%n", numri, numri * 1);
        System.out.printf("2        x   %6d    =   %7d%n", numri, numri * 2);
        System.out.printf("3        x   %6d    =   %7d%n", numri, numri * 3);
        System.out.printf("4        x   %6d    =   %7d%n", numri, numri * 4);
        System.out.printf("5        x   %6d    =   %7d%n", numri, numri * 5);
        System.out.printf("6        x   %6d    =   %7d%n", numri, numri * 6);
        System.out.printf("7        x   %6d    =   %7d%n", numri, numri * 7);
        System.out.printf("8        x   %6d    =   %7d%n", numri, numri * 8);
        System.out.printf("9        x   %6d    =   %7d%n", numri, numri * 9);
        System.out.printf("10       x   %6d    =   %7d%n", numri, numri * 10);
        System.out.println("--------------------------------------------");


    }
}















