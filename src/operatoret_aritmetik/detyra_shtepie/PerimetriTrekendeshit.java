package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

//Zamira
public class PerimetriTrekendeshit {
    //p=a+b+c
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj brinjen a: ");
        double a = reader.nextDouble();
        System.out.print("Shkruaj brinjen b: ");
        double b = reader.nextDouble();
        System.out.print("Shkruaj brinjen c: ");
        double c = reader.nextDouble();

        double perimeter = a + b + c;
        System.out.printf("Perimteri i trekendeshit eshte %.2f%n", perimeter);
    }
}











