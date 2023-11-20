package operatoret_aritmetik.testi;

import java.util.Scanner;

public class Detyra4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj tekstin: ");
        String text = reader.nextLine();

        System.out.print("Shkruaj numrin: ");
        int number = reader.nextInt();


        System.out.println("Rezultati:");
        System.out.println(text.charAt(number - 1));
        System.out.println(text.charAt(0) + "" + text.charAt(text.length() - 1));
        System.out.printf("%c%c%n", text.charAt(0), text.charAt(text.length() - 1));
    }
}















