package arrays.for_each;

public class MbledhjaMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2},
                {-1, 0},
        };

        int[][] b = {
                {0, -1},
                {2, 1}
        };

        int[][] c = new int[2][2];

        sumMatrix(a, b, c);
//        c[0][0] = a[0][0] + b[0][0];
//        c[0][1] = a[0][1] + b[0][1];
//
//        c[1][0] = a[1][0] + b[1][0];
//        c[1][1] = a[1][1] + b[1][1];

        printMatrix(a);
        System.out.println();
        printMatrix(b);
        System.out.println();
        printMatrix(c);

    }


    public static void sumMatrix(int[][] a, int[][] b, int[][] c) {
        for (int row = 0; row < c.length; row++) {
            for (int col = 0; col < c[row].length; col++) {
                c[row][col] = a[row][col] + b[row][col];
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.printf("%5d", element);
            }
            System.out.println();
        }
    }
}



















