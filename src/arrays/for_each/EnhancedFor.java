package arrays.for_each;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
//        int[][] array2D =new int[5][5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%5d", numbers[i]);
        }
        System.out.println();

        //enhanced for - forEach, forIn
        for (int number : numbers) {
            System.out.printf("%5d", number);
        }
        System.out.println();

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum = " + sum);

    }
}


















