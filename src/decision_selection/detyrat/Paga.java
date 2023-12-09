package decision_selection.detyrat;

import java.util.Scanner;

public class Paga {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj pagen");
        double paga = reader.nextDouble();
        if (paga < 0)
            System.out.println("Borxh koke!");
        else if (paga == 0)
            System.out.println("pa pag");
        else if (paga <= 80)
            System.out.println("social");
        else if (paga <= 120)
            System.out.println("penzioner");
        else if (paga <= 180)
            System.out.println("paga minimale");
        else if (paga <= 300)
            System.out.println("paga mesatare");
        else if (paga <= 400)
            System.out.println("paga e mir");
        else if (paga <= 600)
            System.out.println("paga mbi mesatare");
        else
            System.out.println("page e lart");
        

    }

}














