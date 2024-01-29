package arrays.ushtrime;

public class DetyraMatrixa4x4 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {3, 2, -1, 1},
                {2, 3, 1, 4},
                {2, 1, -2, 4}
        };
        int shuma = sum(matrix);
        System.out.printf("Shuma eshte e barabart me : %d%n", shuma);
        int count = countElements(matrix);
        double average = (double) shuma / count;
        System.out.printf("Mesatarja e antarave te matrix-es eshte: %.2f%n", average);
        int vleraMinimale = min(matrix);
        System.out.println("Vlera minimale eshte: " + vleraMinimale);
    }

    static int sum(int[][] matrix) {
        int sum = 0;
        for (int[] array : matrix) {
            for (int number : array) {
                sum += number;
            }
        }
        return sum;
    }

    static int countElements(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            count += matrix[i].length;
        }
        return count;
    }

    static int min(int[][] matrix) {
        int minimumi = Integer.MAX_VALUE;
        for (int[] array : matrix) {
            for (int numri : array) {
                if (numri < minimumi)
                    minimumi = numri;
            }
        }
        return minimumi;
    }
}














