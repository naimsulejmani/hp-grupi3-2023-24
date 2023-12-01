package decision_selection;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int nr1 = reader.nextInt();
        int nr2 = reader.nextInt();
        int nr3 = reader.nextInt();
        int largest;

        if (nr1 >= nr2) {
            if (nr1 >= nr3) largest = nr1;
            else largest = nr3;
        } else {
            if (nr2 >= nr3) largest = nr2;
            else largest = nr3;
        }
        System.out.println("Numri me i madh eshte: " + largest);

        largest = Math.max(nr1, Math.max(nr2, nr3));
        System.out.println("Numri me i madh eshte: " + largest);
    }
}















