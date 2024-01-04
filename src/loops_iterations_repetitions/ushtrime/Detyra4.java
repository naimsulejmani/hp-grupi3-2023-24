package loops_iterations_repetitions.ushtrime;

import java.util.Scanner;

public class Detyra4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int n = reader.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d,", i);
            if (i % 3 == 0) {
                System.out.println();
            }
        }
        if (n % 3 == 1) {
            System.out.print("0,0,");
        } else if (n % 3 == 2) {
            System.out.print("0,");
        }
    }
}














