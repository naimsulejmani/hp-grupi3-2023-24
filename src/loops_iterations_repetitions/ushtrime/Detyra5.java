package loops_iterations_repetitions.ushtrime;

import java.util.Scanner;

public class Detyra5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        String text;
//
//        do {
//            System.out.print("Bona muhabet pak: ");
//            text = reader.nextLine();
//        } while (!text.equalsIgnoreCase("exit"));


//        System.out.print("Shkruaj dicka: ");
//        String text = reader.nextLine();
//        while (!text.equalsIgnoreCase("Exit")){
//            System.out.print("Shkruaj dicka: ");
//            text= reader.nextLine();
//        }

        for (String text = "";
             !text.equalsIgnoreCase("exit");
             text = reader.nextLine()) {
            System.out.print("Shkruaj dicka: ");
        }

    }
}

















