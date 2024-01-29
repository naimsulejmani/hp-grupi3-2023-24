package arrays.for_each;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        //jagged array
        int[][] array2D = {
                {1, 2, 3},
                {2, 3},
                {1, 2, 3, 4, 5, 6, 7, 8, 9}
        };

        array2D = new int[][]{
                {1, 2, 3},
                {2, 3, 4}
        };

        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                System.out.printf("%5d", array2D[row][col]);
            }
            System.out.println();
        }

        for (int[] array : array2D) {
            for (int number : array) {
                System.out.printf("%5d", number);
            }
            System.out.println();
        }

        int[][][] array3D = new int[3][5][2];
        for (int[][] array2d : array3D) {
            for (int[] array1d : array2d) {
                for (int number : array1d) {
                    System.out.printf("%5d", number);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}














