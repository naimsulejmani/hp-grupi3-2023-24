package loops_iterations_repetitions.for_loop;

import java.util.Scanner;

public class ForPrimeNumber {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        int prime = 1;
        System.out.println("Enter an integer");
        int x = reader.nextInt();
        if (x > 3) {
            for (int i = 2; i < x && prime == 1; i++)
                if (x % i == 0)
                    prime = 0;
            switch (prime) {
                case 1:
                    System.out.println(x + "is prime number");
                    break;
                case 0:
                    System.out.println(x + "is not prime number");
                    break;
            }
        } else
            System.out.println(x + "is prime number");

    }
}
