package operatoret_aritmetik;

import java.util.Scanner;

public class MyClass1 {
    public static void main(String[] args) {
        //krijojme objektin myObj skaneri i cili na sherben me i marr te dhenat nga shfrytezuesi
        // nepermjet tastieres ne konsole
        Scanner myObj = new Scanner(System.in);

        // Njofto shfrytezuesin se cfare informate duhet me dhane
        System.out.println("Enter name, age and salary: ");
        // Lexo komplet rreshtin dhe vendose tek variabla (text) name
        String name = myObj.nextLine();
        // lexo nje int pastaj vendose ne age
        int age = myObj.nextInt();
        // lexo nje vlere double vendose ne salary
        double salary = myObj.nextDouble();

        // shtypi vlerat e marrur nga shfrytezi ne console prap
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }
}











