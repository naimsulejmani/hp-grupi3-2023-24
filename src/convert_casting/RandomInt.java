package convert_casting;

import java.util.Scanner;

public class RandomInt {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj kufirin e numrit: ");
        int number = reader.nextInt();
        double random = Math.random(); // [0, 1)
        int nrGenerated = (int) (number * random);
        System.out.println("Numri i gjeneruar eshte: " + nrGenerated);

    }
}















