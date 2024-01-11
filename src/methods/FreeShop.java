package methods;

import java.util.Scanner;

public class FreeShop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj moshen: ");
        int mosha = reader.nextInt();

        checkAge(mosha);
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}















