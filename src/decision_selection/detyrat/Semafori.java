package decision_selection.detyrat;

import java.util.Scanner;

public class Semafori {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer :");
        int number = reader.nextInt();
        if (number == 1)
            System.out.println("Semafori eshte i kuq");
        else if (number == 2)
            System.out.println("Semafori eshte i verdhe ");
        else if (number == 3)
            System.out.println("Semafori eshte i gjelbert ");
        else if (number == 4)
            System.out.println("Semafori eshte duke blinkuar");
        else {
            System.out.println("Semafori nuk punon");
        }
    }
}















