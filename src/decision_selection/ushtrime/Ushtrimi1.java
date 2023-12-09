package decision_selection.ushtrime;

import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruani gjatesine e brinjes A: ");
        int brinjaA = reader.nextInt();
        System.out.println("Shkruani gjatesine e brinjes B: ");
        int brinjaB = reader.nextInt();
        if (brinjaA > 0 && brinjaB > 0) {
            if (brinjaA == brinjaB) {
                System.out.println("eshte katror");
            } else {
                System.out.println("Nuk eshte katror");
            }
            System.out.println(brinjaA == brinjaB
                    ? "eshte katror" : "nuk eshte katror"
            );
        } else {
            System.out.println("Nuk guxon te permbaj vlera 0 ose me te vogel");
        }
    }
}











