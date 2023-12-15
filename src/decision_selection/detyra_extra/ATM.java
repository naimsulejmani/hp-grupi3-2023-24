package decision_selection.detyra_extra;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("ATM Menu:");
        System.out.println("1.Check balance");
        System.out.println("2.Deposit menu ");
        System.out.println("3.Withdraw money ");
        System.out.println("4.Transfer money");
        System.out.println("5.Exit");
        System.out.println("Enter your choice :");
        int number = reader.nextInt();
        switch (number) {
            case 1:
                System.out.println("Balanci juaj 50 euro");
                break;
            case 2:
                System.out.println("Depozit 100 euro");
                break;
            case 3:
                System.out.println("Terhek 70 euro");
                break;
            case 4:
                System.out.println("Transfer 50 euro");
                break;
            case 5:
                System.out.println("Programi mbyllet");
                break;
            default:
                System.out.println("Nuk ke zgjedhur opsion te duhur");
                break;
        }

    }
}













