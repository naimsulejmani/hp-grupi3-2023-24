package loops_iterations_repetitions.jump_statements;

public class BreakAsGoTo {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Before the break!");
                    if(t) break first;
                    System.out.println("This code will not execute");
                }
                System.out.println("HERE WE ARE IN SECOND");
            }
            System.out.println("HERE WE ARE IN FIRST");
        }
        System.out.println("HERE WE ARE IN MAIN");
    }
}
















