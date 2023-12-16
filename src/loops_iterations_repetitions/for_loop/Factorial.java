package loops_iterations_repetitions.for_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int fact = 1;
        System.out.println("enter an integer: ");
        int n = reader.nextInt();
//        for (int i = 1; i <= n; i++) {
//            fact *= i;
//            //fact = fact * i;
//        }
//        System.out.println("factorial is " + fact);

        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("factorial is " + fact);
    }
}












