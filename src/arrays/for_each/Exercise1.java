package arrays.for_each;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("Matrix[%d][%d]: ", i + 1, j + 1);
                matrix[i][j] = in.nextInt();
            }
        }
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.printf("%5d", element);
            }
            System.out.println();
        }
    }
}

















