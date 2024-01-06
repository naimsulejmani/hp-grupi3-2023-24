package loops_iterations_repetitions.jump_statements;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.printf("%d ", i);
        }
    }
}











