package operatoret_aritmetik;

import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = myObj.nextLine();

        System.out.println("Username is " + username);
        System.out.println(username.length());
        System.out.println(username.charAt(0));
        System.out.println(username.charAt(username.length() - 1));


    }
}








