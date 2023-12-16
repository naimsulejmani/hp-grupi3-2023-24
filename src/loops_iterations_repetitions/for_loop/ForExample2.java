package loops_iterations_repetitions.for_loop;

import java.util.Scanner;

public class ForExample2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer");
        int numri = reader.nextInt();

        int shuma = 0;

        for (int i = 1; i<= numri; i++){
            shuma += i;
        }
        System.out.println("Shuma e barabarte me "+ shuma);
    }
}













