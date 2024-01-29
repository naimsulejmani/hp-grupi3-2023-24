package arrays.ushtrime;

import java.util.Scanner;

public class Det4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin e rreshtave dhe kolonave: ");
        int row = reader.nextInt();
        int col = reader.nextInt();

        int[][] array2D = new int[row][col];
        for (int i = 0; i<array2D.length; i++){
            for (int j = 0; j< array2D[i].length;j++){
                array2D[i][j] = (int)(Math.random()*1000)+1;
            }
        }
        printMatrix(array2D);
        printMatrixDiagonal(array2D);
    }


    static void printMatrixDiagonal(int[][] matrix){
        for (int i = 0; i< matrix.length;i++){
            for (int j = 0; j< matrix[i].length; j++){
                if (i == j)
                    System.out.println(matrix[i][j]);
            }
        }

//        for (int i = 0; i < matrix.length; i++) {
//            if (i < matrix[i].length) {
//                System.out.println(matrix[i][i]);
//            }
//        }
    }
    static void printMatrix(int[][] matrix){
            for(int[] array:matrix){
                for(int number:array){
                    System.out.printf("%6d", number);
                }
                System.out.println();
            }
    }












}










