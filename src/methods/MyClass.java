package methods;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        myMethodStatic();
        MyClass.myMethodStatic();
        System.out.println(Math.min(100,200));

        Scanner reader = new Scanner(System.in);

        System.out.println(reader.nextInt());

        MyClass myClass = new MyClass();
        myClass.myMethodNotStatic();

        ciliPlanetEshteMeIMadh();

    }

    static void myMethodStatic() {

    }

    void myMethodNotStatic() {

    }

    static void ciliPlanetEshteMeIMadh() {
        System.out.println("Jupiteri!");
    }


}














