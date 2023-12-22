package loops_iterations_repetitions.for_loop.ushtrime;

import java.util.Scanner;

public class ForDetyra1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int num = scan.nextInt();
//        for (int i = 1; i <= num; i++) {
//            System.out.println("**********");
//        }

//        for (int i = num; i >= 1; i--) {
//            System.out.println("**********");
//        }

        for (int i = 1; i <= num; i++) { // rreshtat
            for (int j = 1; j <= num; j++) { // kolonat
                System.out.print("*");
            }
            System.out.println(); // dil ne rresht te ri, u kryen kolonat
        }


    }
}














