package loops_iterations_repetitions.for_loop.ushtrime;

import java.util.Scanner;

public class ForDetyra4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("SHkruaj numrin e par: ");
        int nr1 = reader.nextInt();
        System.out.print("Shkruaj numrin e dyt: ");
        int nr2 = reader.nextInt();

        for (int row = 1; row <= nr1; row++){
            for (int col = 1; col <= nr2; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
