package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class SyprinaEDrejtekendeshit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj gjatesin e drejtekendeshit: ");
        double height = reader.nextDouble();
        System.out.print("Gjeresia e drejtekendeshit: ");
        double width = reader.nextDouble();

        double area = height * width;
        System.out.printf("Syprina e drejtekendeshit eshte %.1f%n" ,area);


    }
}











