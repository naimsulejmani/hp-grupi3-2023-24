package loops_iterations_repetitions.ushtrime;

import operatoret_aritmetik.SystemOutExample;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int n = reader.nextInt();
        System.out.println("Rezultati");
        System.out.println("--------------");
        for (int row = 1; row <= n; row++) {
//            System.out.printf("%d %n", row);
            for (int i = 1; i <= row; i++) {
                System.out.printf("%d", i);
            }
            for (int j = row; j >= 1; j--) {
                System.out.printf("%d", j);
            }
            System.out.println();
        }


    }
}












