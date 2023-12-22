package loops_iterations_repetitions.for_loop;

public class NestedForLoop {
    public static void main(String[] args) {

        // outside for
        for (int i = 0; i < 5; i++) { //rows
            //inside for repeated completely for each outside iteration
            for (int j = 0; j < 5; j++) { //columns
                System.out.printf("%d %d %n", i, j);
            }
        }
    }
}








