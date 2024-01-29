package arrays.multi;

public class ShtypjaMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {3, 4, 5},
                {1, 1, 0}
        };

        //shko per cdo rresht
        for (int row = 0; row < matrix.length; row++) {
            //shko per cdo element te rreshtit / kolone te rreshtit
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%4d", matrix[row][col]);
            }
            System.out.println();
        }


    }
}











