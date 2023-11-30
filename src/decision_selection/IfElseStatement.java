package decision_selection;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin e pare: ");
        int nr1 = reader.nextInt();
        System.out.print("Shkruaj numerin e dyte: ");
        int nr2 = reader.nextInt();
        int max;
        if (nr1 > nr2) {
            max = nr1;
        }
        else {
            max = nr2;
        }
        System.out.println("Maksimumi eshte: " + max);

    }
}
