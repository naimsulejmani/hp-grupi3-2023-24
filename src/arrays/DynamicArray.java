package arrays;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa nota po deshironi me i dhene: ");
        int nrNotave = reader.nextInt();

        //nrNotave = 100

        int[] notat = new int[nrNotave];


        for (int i = 0; i < notat.length; i++) {
            System.out.printf("Shkruaj noten e %d: ", i + 1);
            notat[i] = reader.nextInt();
        }

        System.out.println();
        System.out.println("------------------------");
        for (int i = 0; i < notat.length; i++) {
            System.out.printf("Nota e lendes se %d eshte %d! %n", i + 1, notat[i]);
        }

        double sum = 0.0;
        for (int i = 0; i < notat.length; i++) {
            sum += notat[i];
        }
        double average = sum / notat.length;

        System.out.printf("Mesatarja e studentit eshte %.2f!%n", average);


    }
}
















