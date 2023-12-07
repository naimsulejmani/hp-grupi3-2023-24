package decision_selection.detyrat;

import java.util.Scanner;

public class Plotpjestueshem1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("jepni 2 numra te qfaredoshem: ");
        int nr1 = reader.nextInt();
        int nr2 = reader.nextInt();
//        if (nr1 % nr2 == 0) {
//            System.out.println("numrat jane te plotpjesetueshem");
//        } else {
//            System.out.println("numrat nuk jane te plotpjestueshem");
//        }
//        System.out.println(
//                nr1 % nr2 == 0
//                        ? "numrat jane te plotpjestueshem"
//                        : "numrat nuk jane te plotpjesetueshem"
//        );

        if (nr1 % nr2 == 0) {
            System.out.printf("numri %d eshte i plotpjestueshem me %d", nr1, nr2);
        } else if (nr2 % nr1 == 0) {
            System.out.printf("numri %d eshte i plotpjestueshem me %d", nr2, nr1);
        } else {
            System.out.printf("numrat %d dhe %d nuk jane te plotpjestueshem", nr1, nr2);
        }
    }
}














