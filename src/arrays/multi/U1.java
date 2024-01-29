package arrays.multi;

public class U1 {
    public static void main(String[] args) {
        int[] numrat = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int numri : numrat) {
            System.out.printf("%4d", numri);
        }
        System.out.println();

        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            int rand = (int) (Math.random() * 100) + 1;
            randomArray[i] = rand;
        }

        for (int numri : randomArray) {
            System.out.printf("%5d", numri);
        }
    }
}












