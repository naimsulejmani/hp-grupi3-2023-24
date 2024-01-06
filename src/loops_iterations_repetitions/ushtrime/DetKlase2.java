package loops_iterations_repetitions.ushtrime;

import java.util.Scanner;

public class DetKlase2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin: ");
        int n = reader.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n - i);
            }
            System.out.println();
        }
    }
}














