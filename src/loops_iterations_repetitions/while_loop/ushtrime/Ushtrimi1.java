package loops_iterations_repetitions.while_loop.ushtrime;

import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj n: ");
        int n = reader.nextInt();
        int count = 1;
        System.out.printf("%5s %15s %15s %15s%n",
                        "Numri", "Katrori", "Kubi", "Square Root");
        while (count <= n) {
            System.out.printf("%5d %15d %15.0f %15.2f%n",
                    count, count * count, Math.pow(count, 3), Math.sqrt(count));
            count++;
        }

    }
}
















