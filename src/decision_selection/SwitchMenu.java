package decision_selection;

import java.util.Scanner;

public class SwitchMenu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj meny-ne: ");
        String menu = reader.nextLine();

        switch (menu) {
            case "Administration":
                System.out.println("Menyja Administration");
                break;
            case "Dashboard":
                System.out.println("Menyja Dashboard");
                System.out.println("-----------------");
                break;
            default:
                System.out.println("Nuk keni zgjedhur meny nga te lejuarat");
                break;
        }

        switch (menu) {
            case "Administration" -> System.out.println("Menyja Administration");
            case "Dashboard" -> {
                System.out.println("Menyja Dashboard");
                System.out.println("-----------------");
            }
            default -> System.out.println("Nuk keni zgjedhur meny nga te lejuarat");
        }
    }
}
















