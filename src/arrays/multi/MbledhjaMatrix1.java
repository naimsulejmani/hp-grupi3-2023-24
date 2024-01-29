package arrays.multi;

public class MbledhjaMatrix1 {
    public static void main(String[] args) {
        int[][] a = {
                {3, 4},
                {1, 2}
        };

        int[][] b = {
                {1, 2},
                {-1, -3}
        };

        int[][] c = new int[2][2];

        c[0][0] = a[0][0] + b[0][0];
        c[0][1] = a[0][1] + b[0][1];

        c[1][0] = a[1][0] + b[1][0];
        c[1][1] = a[1][1] + b[1][1];

        for (int[] array : c) {
            for (int number : array) {
                System.out.printf("%5d", number);
            }
            System.out.println();
        }


        for (int row = 0; row < c.length; row++) {
            for (int col = 0; col < c[row].length; col++) {
                c[row][col] = a[row][col] + b[row][col];
            }
        }


        for (int[] array : c) {
            for (int number : array) {
                System.out.printf("%5d", number);
            }
            System.out.println();
        }


    }
}











