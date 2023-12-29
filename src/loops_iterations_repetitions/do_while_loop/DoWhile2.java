package loops_iterations_repetitions.do_while_loop;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("shkruaj nje numer: ");
        int number = reader.nextInt();
        int count = 1;
        System.out.printf("%5s %15s %15s %15s%n",
                "NR", "Square", "Cube", "Square Root");
        do {
            System.out.printf("%5d %15d %15.0f %15.2f%n",
                    count, count * count, Math.pow(count, 3), Math.sqrt(count));
            count++;
        } while (count <= number);
    }
}


















