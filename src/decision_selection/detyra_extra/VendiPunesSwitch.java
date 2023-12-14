package decision_selection.detyra_extra;

import java.util.Scanner;

public class VendiPunesSwitch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj moshen: ");
        int mosha = reader.nextInt();
        System.out.println("Shkruaj gjinine(M/F): ");
        char gjinia = reader.next().charAt(0);
        System.out.println("Shkruaj statusin martesor(P/J): ");
        char statusi = reader.next().charAt(0);

        switch (gjinia) {
            case 'f', 'F':
                System.out.println("Ju do te punoni ne vende urbane!");
                break;
            case 'm', 'M':
                if (mosha >= 20 && mosha <= 40) {
                    System.out.println("JU mund te punoni ku te doni");
                } else if (mosha >= 40 && mosha <= 60) {
                    System.out.println("Ju mund te punoni vetem ne zonen urbane");
                } else {
                    System.out.println("Gabim");
                }
                break;
            default:
                System.out.println("Gabim");
                break;
        }
    }
}














