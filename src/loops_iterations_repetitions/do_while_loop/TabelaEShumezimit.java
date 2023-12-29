package loops_iterations_repetitions.do_while_loop;

import java.util.Scanner;

public class TabelaEShumezimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani nje numer nga 1-10: ");
        int nr = reader.nextInt();

        if (nr >= 1 && nr <= 10) {
            int count = 1;
            do {
                System.out.printf("%3d x %3d = %3d%n", nr, count, nr * count);
                count++;
            } while (count <= 10);
        } else {
            System.out.println("Nuk lejohen numrat tjere! ");
        }
    }
}















