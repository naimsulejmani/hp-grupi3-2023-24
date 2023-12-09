package decision_selection.ushtrime;

import java.util.Scanner;

public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa vite punoni per kompanine: ");
        float viteSherbim = reader.nextFloat();
        System.out.println("Sa e ke pagen: ");
        float paga = reader.nextFloat();

        if (viteSherbim >= 5) {
            float bonusi = paga * 0.05f;
            paga = paga + bonusi;
            System.out.printf("Bonusi juaj eshte %.2f%n", bonusi);
            System.out.printf("Paga juaj me bonus eshte %.2f%n", paga);
        } else {
            System.out.println("Nuk ju takon bonusi");
        }
    }
}
















