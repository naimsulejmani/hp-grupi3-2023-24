package decision_selection.ushtrime;

import java.util.Scanner;

public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Shkruaj numrin e pare: ");
        int nr1 = scan.nextInt();

        System.out.print("Shkruaj numrin e dyte: ");
        int nr2 = scan.nextInt();

        int numriMeiMadh = (nr1 >= nr2) ? nr1 : nr2;
        System.out.println("numri me i madh eshte: " + numriMeiMadh);

        if (nr1 >= nr2) {
            System.out.println("Numri1 eshte me i madh " + nr1);
        } else {
            System.out.println("Numri2 eshte me i madh " + nr2);
        }
    }
}















