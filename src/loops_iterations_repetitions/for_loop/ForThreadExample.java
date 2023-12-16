package loops_iterations_repetitions.for_loop;

public class ForThreadExample {
    public static void main(String[] args) throws InterruptedException {

        for (int second = 10; second >= 1; second--) {
            System.out.println(second);
            Thread.sleep(1000);
        }
        System.out.println("Urime viti i ri!");
    }
}















