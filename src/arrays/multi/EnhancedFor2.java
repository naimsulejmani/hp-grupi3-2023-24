package arrays.multi;

public class EnhancedFor2 {
    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] array : array2D) {
            for (int number : array) {
                System.out.printf("%4d", number);
            }
            System.out.println();
        }

    }
}














