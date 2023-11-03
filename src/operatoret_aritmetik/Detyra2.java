package operatoret_aritmetik;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Sa gola i ka dhene Kosova: ");

        int kosova = myObj.nextInt();

        System.out.print("Sa gola i ka dhene Shqiperia: ");

        int shqiperia = myObj.nextInt();

        System.out.println("----------------------------");
        System.out.println("Kosova - Shqiperia: " + kosova
                + "-" + shqiperia);

        System.out.printf("Kosova - Shqiperia: %d:%d%n", kosova, shqiperia);
        System.out.printf("Kosova %d:%d Shqiperia %n", kosova, shqiperia);
        System.out.println("-----------------------------");


    }
}




