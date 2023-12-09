package decision_selection;

import java.util.Scanner;

public class Menyja {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Zgjedh njeren nga menyte: ");
        System.out.println("1-File");
        System.out.println("2-Edit");
        System.out.println("3-View");
        System.out.println("4-Help");
        System.out.println("5-Tools");
        System.out.println("Tjeter-Exit");

        int menu = reader.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Keni zgjedhur menyn File");
                break;
            case 2:
                System.out.println("Keni zgjedhur menyn Edit");
                break;
            case 3:
                System.out.println("Keni zgjedhur menyn View");
                break;
            case 4:
                System.out.println("Keni zgjehdur menyn Help");
                break;
            case 5:
                System.out.println("Keni zgjedhur menyn Tools");
                break;
            default:
                System.out.println("Programi po mbyllet! EXIT!");
                break;
        }
    }
}












