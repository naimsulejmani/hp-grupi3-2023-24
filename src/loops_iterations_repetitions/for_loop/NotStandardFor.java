package loops_iterations_repetitions.for_loop;

public class NotStandardFor {
    public static void main(String[] args) {
        int from = 1;
        int to = 10;

        for (; from <= to; from++) {
            System.out.printf("%d ", from);
        }
        System.out.println();

        from = 1;
        for (; from <= to; ) {
            System.out.printf("%d ", from++);
        }
        System.out.println();
        from = 1;
        //endless loop , infinite loop
        for (; ; ) {
            System.out.printf("%d ", from++);
            if (from > to) break;
        }
    }
}
















