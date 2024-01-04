package loops_iterations_repetitions.ushtrime;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje tekst: ");
        String text = reader.nextLine();
        System.out.println("Resultati");
        System.out.println("------------------");
//        for (int i = 0; i < text.length(); i++) {
//            System.out.printf("%C %C %n",
//                    text.charAt(i), text.charAt(text.length() - 1 - i));
//        }

//        int i = 0;
//        while (i < text.length()) {
//            System.out.printf("%C %C %n",
//                    text.charAt(i), text.charAt(text.length() - 1 - i));
//            i++;
//        }

        int i = 0;
        do {
            System.out.printf("%C %C %n",
                    text.charAt(i), text.charAt(text.length() - 1 - i));
            i++;
        } while (i < text.length());


    }
}













