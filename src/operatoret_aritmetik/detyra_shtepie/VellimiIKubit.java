package operatoret_aritmetik.detyra_shtepie;

import java.util.Scanner;

//Njomze Bajgora
public class VellimiIKubit {
    // v=a^3
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj brinjen a te kubit: ");
        double side = reader.nextDouble();

        double volume = Math.pow(side, 3);
        System.out.printf("Vellimi i kubit eshte: %.3f%n ", volume);


    }
}




