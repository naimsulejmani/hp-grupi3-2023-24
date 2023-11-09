package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class SyprinaERrethit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Shkruaj rrezen e rrethit: ");
        double radius = scan.nextDouble();

        double area = Math.PI * Math.pow(radius,2);
        System.out.printf("Syprina e rretit eshte %.2f%n",area);
    }
}














