package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class SyprinaEKatrorit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj brinjen e katrorit: ");
        double side = reader.nextDouble();
        double area = side * side;
        System.out.printf("Syprina e katrorit eshte %.2f%n", area);
    }
}













