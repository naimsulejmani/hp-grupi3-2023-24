package decision_selection.detyra_extra;

import java.util.Scanner;

public class VendiPunes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj moshen: ");
        int mosha = reader.nextInt();
        System.out.println("Shkruaj gjinine(M/F): ");
        char gjinia = reader.next().charAt(0);
        System.out.println("Shkruaj statusin martesor(P/J): ");
        char statusi = reader.next().charAt(0);

        if (gjinia == 'f' || gjinia == 'F') {
            System.out.println("Ju do te punoni ne zonat urbane");
        } else if (gjinia == 'm' || gjinia == 'M') {
            if (mosha >= 20 && mosha <= 40) {
                System.out.println("JU mund te punoni ku te doni");
            } else if (mosha >= 40 && mosha <= 60) {
                System.out.println("Ju mund te punoni vetem ne zonen urbane");
            } else {
                System.out.println("Gabim");
            }
        } else {
            System.out.println("Gabim");
        }


    }
}














