package methods;

public class Delegimi {
    public static void main(String[] args) {
        System.out.println("Before calling method sayHi()");
        sayHi();
        System.out.println("After calling method sayHi()");

        printInfo("Naimi", 37);
        printInfo("Filani", 24);
        printInfo("Filanja", 22);

        //System.out.println(printInfo("test",10));
    }

    static void sayHi() {
        System.out.println("Hi, hi!");
    }

    static void printInfo(String name, int age) {
        System.out.printf("Une jam %s dhe i kam %d vite!%n",
                name, age);
    }

}











