package loops_iterations_repetitions.for_loop.ushtrime;

import java.util.Scanner;

public class ForDetyra3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int number = reader.nextInt();

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("&");
            }
            System.out.println();
        }
    }
}















