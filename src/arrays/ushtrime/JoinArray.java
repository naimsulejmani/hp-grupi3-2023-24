package arrays.ushtrime;

public class JoinArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7};

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[i - a.length];
            }
        }

        int cIndex = 0;
        for (int number : a) {
            c[cIndex++] = number;
        }
        for (int number : b) {
            c[cIndex++] = number;
        }


        for (int number : c) {
            System.out.printf("%5d", number);
        }
        System.out.println();

    }
}








