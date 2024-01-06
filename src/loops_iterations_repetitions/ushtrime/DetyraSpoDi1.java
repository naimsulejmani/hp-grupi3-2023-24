package loops_iterations_repetitions.ushtrime;

import java.util.Scanner;

public class DetyraSpoDi1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer nga 1 deri me 100: ");
        int n = reader.nextInt();

        if (n >= 1 && n <= 100) {
            int sum = 0;
            for (int x = 0; x <= n; x++) {
                sum += (x - 2);
            }
            System.out.println("Shuma eshte e barabarte me " + sum);
        } else {
            System.out.println("Numri eshte jasht rangun 1 deri me 100! Lexo mire!");
        }
    }
}
















