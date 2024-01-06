package loops_iterations_repetitions.ushtrime;

import java.util.Scanner;

public class DetyrKlase {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin: ");
        int num = reader.nextInt();
        for (int count = 1; count <= num; count++) {
            char simboli = count % 2 == 0 ? '$' : '*';
            for (int i = 1; i <= count; i++) {
                System.out.printf("%c", simboli);
            }
            System.out.println();
        }


    }
}










