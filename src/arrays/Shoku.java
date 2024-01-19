package arrays;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Shoku {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin e shokeve: ");
//        int numri = reader.nextInt();
//        reader.nextLine();

        int numri = Integer.parseInt(reader.nextLine());
        String[] emratEShokve = new String[numri];
        String[] emrat = {"Filan", "Fistek", "Fistekime"};
        for (int i = 0; i < emratEShokve.length; i++) {
            System.out.printf("Shkruaj shokun e %d: ", i + 1);
            emratEShokve[i] = reader.nextLine();
        }
        System.out.println("Lista e shokve");
        for (int i = 0; i < emratEShokve.length; i++) {
            System.out.printf("%d %s %n", i + 1, emratEShokve[i]);
        }
    }
}
