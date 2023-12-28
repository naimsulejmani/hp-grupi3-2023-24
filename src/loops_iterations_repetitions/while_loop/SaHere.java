package loops_iterations_repetitions.while_loop;

import java.util.Scanner;

public class SaHere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shkruaj dy numra: ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int count = 0;

        while (num1 >= num2) {
            count++;
            num1 -= num2;
        }
        System.out.println(count);
    }
}








