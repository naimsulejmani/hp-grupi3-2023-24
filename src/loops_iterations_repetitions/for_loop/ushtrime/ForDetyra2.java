package loops_iterations_repetitions.for_loop.ushtrime;

import java.util.Scanner;

public class ForDetyra2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int number = reader.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}











