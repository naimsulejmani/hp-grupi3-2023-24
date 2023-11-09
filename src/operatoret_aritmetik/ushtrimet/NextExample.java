package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class NextExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj emrin dhe mbiemrin: ");
        String emri = reader.next();
        reader.nextLine();
        String mbiemri = reader.nextLine();
        System.out.println(emri + " " + mbiemri);
    }
}
