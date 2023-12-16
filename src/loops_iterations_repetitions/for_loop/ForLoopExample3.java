package loops_iterations_repetitions.for_loop;

import java.util.Scanner;

public class ForLoopExample3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruaj nje numer: ");

        int numri = reader.nextInt();

        // (2 * pi * k)/numri

        for (int k = 0; k <= numri; k++) {
            System.out.printf("%d  %20.2f%n", k, 2 * Math.PI * k / numri);
        }
    }
}












