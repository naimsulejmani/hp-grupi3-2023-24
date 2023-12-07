package decision_selection.detyrat;

import java.util.Scanner;

public class Rangu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruaj nje numer brenda rangu -10000 deri ne 10000: ");
        int nr = reader.nextInt();

        if (nr >= -10000 && nr <= 10000)
            System.out.println("Numri eshte i dhene ne rang.");
        else
            System.out.println("Numri nuk eshte i dhene ne rang.");

        System.out.println(
                nr >= -10000 && nr <= 10000
                        ? "Numri brenda rangu"
                        : "Numri jasht rangut"
        );

    }
}


















