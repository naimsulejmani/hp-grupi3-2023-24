package arrays.multi;

import java.util.Scanner;

public class UshtrimeMatrix1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[][] matrix = new int[2][2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("Shkruaj matrix[%d][%d]: ", row + 1, col + 1);
                matrix[row][col] = reader.nextInt();
            }
        }

        for (int[] array : matrix) {
            for (int number : array) {
                System.out.printf("%5d", number);
            }
            System.out.println();
        }
    }
}













