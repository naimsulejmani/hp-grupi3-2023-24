package loops_iterations_repetitions.debugging;

import java.util.Scanner;

public class Taxat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sa page totale ke pasur gjate vitit: ");
        double salary = reader.nextDouble();
        double rate = 0.0;

        if (salary < 47450) {
            rate = 0.22;
        }  if (salary < 148650) {
            rate = 0.25;
        }  if (salary < 174700) {
            rate = 0.28;
        } else  if (salary < 311950) {
            rate = 0.33;
        } else {
            rate = 0.35;
        }

        System.out.printf("Tatimi: %.2f %%%n", rate);
        System.out.printf("Vlera e tatimit: %.2f $%n", rate * salary);
        System.out.printf("Vlera e mbetur: %.2f $%n", salary - rate * salary);

    }
}













