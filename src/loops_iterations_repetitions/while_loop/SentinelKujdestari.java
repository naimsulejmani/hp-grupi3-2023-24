package loops_iterations_repetitions.while_loop;

import java.util.Scanner;

public class SentinelKujdestari {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0, count = 0, num;
        double avg;

        System.out.println("Enter an integer (0 to quit): ");
        num = reader.nextInt();
        //SENTINELI / KUJDESTARI -> Perderisa numri eshte i ndryshueshem prej zero(0)
        while (num != 0) {
            count++;
            sum += num;
            System.out.println("Enter an integer (0 to quit): ");
            num = reader.nextInt();
        }

        avg = (double) sum / count;
        System.out.printf("Average: %.2f %n", avg);

    }
}











