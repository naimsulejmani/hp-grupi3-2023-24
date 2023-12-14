package decision_selection.detyra_extra;

import java.util.Scanner;

public class detyra5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int generatedNumber = (int) (Math.random() * 11);
        System.out.print("Shkruani nje numer nga 0 deri ne 10: ");
        int numri = reader.nextInt();
        if (numri == generatedNumber) {
            System.out.println("Urime,fituat.");
        } else {
            System.out.println("Heren tjeter. ");
        }
        System.out.println(
                numri == generatedNumber ? "Urime,fituat." : "Heren tjeter."
        );
    }
}













