package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

public class Mesatarja {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj tre numra me rradh: ");
        int numer1 = reader.nextInt();
        int numer2 = reader.nextInt();
        int numer3 = reader.nextInt();

        double mesatarja = (numer1 + numer2 + numer3) / 3.0;

        System.out.println(mesatarja);
    }

}













