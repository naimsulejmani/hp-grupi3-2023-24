package other_operators;

import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Nr1 = ");
        int nr1 = reader.nextInt();
        System.out.println("Nr2 = ");
        int nr2 = reader.nextInt();

        System.out.println(nr1 & nr2);
        System.out.println(nr1 | nr2);

    }
}
