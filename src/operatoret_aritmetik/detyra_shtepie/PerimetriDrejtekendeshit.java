package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

//Arbesa Alshiqi
// p=2*(a+b)
public class PerimetriDrejtekendeshit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj gjatesine e brinjes se drejtekendeshit: ");
        double height = reader.nextDouble();
        System.out.print("Shkruaj gjeresine e brinjes se drejtekendeshit: ");
        double width = reader.nextDouble();

        double perimeter = 2 * (height + width);
        System.out.printf("Perimetri i drejtekendeshit eshte: %.2f%n", perimeter);

    }

}










