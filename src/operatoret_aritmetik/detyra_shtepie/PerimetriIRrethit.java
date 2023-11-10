package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

//Anita Hasani
//p=2*PI*r
public class PerimetriIRrethit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruaj gjatesine e rrezes : ");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Perimetri i rrethit eshte : %.3f %n ", perimeter);
    }
}











