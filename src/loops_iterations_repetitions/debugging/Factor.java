package loops_iterations_repetitions.debugging;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long n = reader.nextLong();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                System.out.printf("%d ", i);
                n = n / i;
            }
        }

        if (n > 1) System.out.printf("%d ", n);
        else System.out.println();
    }
}
