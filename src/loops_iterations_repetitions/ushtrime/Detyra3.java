package loops_iterations_repetitions.ushtrime;

import java.util.Scanner;

public class Detyra3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String personi1 = "";
        String personi2 = "";
        do {
            System.out.print("Personi1: ");
            personi1 = reader.nextLine();

            if (personi1.equalsIgnoreCase(personi2)
                    && personi1.equalsIgnoreCase("stop"))
                break;

            System.out.print("Personi2: ");
            personi2 = reader.nextLine();
        } while (!(personi1.equalsIgnoreCase("Stop") &&
                personi2.equalsIgnoreCase("Stop")));
        System.out.println("Biseda perfundoi! U ruajt per ekzaminime te metutjeshme nga stafi!");
    }
}




















