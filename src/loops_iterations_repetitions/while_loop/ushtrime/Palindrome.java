package loops_iterations_repetitions.while_loop.ushtrime;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj tekstin: ");
        String text = reader.nextLine();

        String newText = "";
        int index = 0; // pozita e shkronjes ne tekst ku fillojme (shkronja e pare)
        while (index < text.length()) {
            char shkronja = text.charAt(index++);
            newText = shkronja + newText;
        }

        if (text.equalsIgnoreCase(newText)) {
            System.out.println("Teksti i dhene eshte palindrome!");
        } else {
            System.out.println("Teksti i dhene nuk eshte palindrome!");
        }

    }
}














