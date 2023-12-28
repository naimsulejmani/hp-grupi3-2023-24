package provimi.grupi3;

import java.util.Scanner;

public class Detyra4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruani numrin: ");
        int num = scanner.nextInt();

        int result = num % 3;

        switch (result) {
            case 0 -> System.out.println("Numri eshte i plotpjestueshem me 3");
            default -> {
                int difference = 3 - result;
                System.out.printf("Numri nuk eshte i plotpjestueshem, i nevojitet edhe %d", difference);
            }
        }
    }
}
