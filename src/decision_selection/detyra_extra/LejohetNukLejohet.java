package decision_selection.detyra_extra;

import java.util.Scanner;

public class LejohetNukLejohet {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Numri i oreve te mbajtura: ");
        int oretEMbajtura = reader.nextInt();
        System.out.print("Numri i oreve te ndjekura: ");
        int oretENdjekura = reader.nextInt();

        double perqindja = (double) oretENdjekura / oretEMbajtura * 100;
        System.out.printf("Lenda eshte ndjekur %.2f %% %n", perqindja);
        if (perqindja >= 75) {
            System.out.println("Ju keni te drejt te hyni ne provim. ");
        } else {
            System.out.print("A keni arsye per mungesat tuaja (P/J): ");
            char arsyeja = reader.next().charAt(0);
            if (arsyeja == 'p' || arsyeja == 'P') {
                System.out.println("Ju keni te drejte te hyni ne provim");
            } else {
                System.out.println("Ju nuk keni te drejt te hyni ne provim. ");
            }
        }


    }
}














