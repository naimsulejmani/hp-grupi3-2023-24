package decision_selection;

public class Toleranca {
    public static void main(String[] args) {
        final double TOLERANCE = 0.0000001;
        double value = 1.0;
        value -= 0.10;
        value -= 0.10;
        value -= 0.10;
        value -= .10;
        value -= .10;
        System.out.println(value);
        if (value == 0.5) {
            System.out.println("Eshte 0.5");
        } else {
            System.out.println("Nuk eshte 0.5");
        }

        if (Math.abs(value - 0.5) < TOLERANCE) {
            System.out.println("Eshte 0.5");
        } else {
            System.out.println("Nuk eshte 0.5");
        }
    }
}




