package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

//Shpat Konjusha
public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin e pare: ");
        int number1 = reader.nextInt();
        System.out.print("Shkruaj numrin e dyte: ");
        int number2 = reader.nextInt();

        System.out.println("Llogaritjet aritmetike");
        System.out.println("----------------------------");

        System.out.printf("%d + %d = %d %n", number1, number2, number1 + number2);
        System.out.printf("%d - %d = %d %n", number1, number2, number1 - number2);
        System.out.printf("%d * %d = %d %n", number1, number2, number1 * number2);
        System.out.printf("%d / %d = %d %n", number1, number2, number1 / number2);
        System.out.printf("%d %% %d = %d %n", number1, number2, number1 % number2);

    }
}


