package arrays;

public class ArrayDeclartion {
    public static void main(String[] args) {

        /*
        data-type[] emriVariables = new data-type[madhesiaFikse];
         */

        int[] numrat = new int[10];
        String[] emrat = new String[44];

        double[] teHyrat; // kemi deklaru varg


        teHyrat = new double[100]; // inicializojme vendin, rezervojme ne memorien heap

        int[] notatEAdnanit = {5, 6, 10};
        System.out.println(notatEAdnanit.length);
        System.out.println(notatEAdnanit[0]);
        System.out.println(notatEAdnanit[1]);
        System.out.println(notatEAdnanit[2]);
        System.out.println(notatEAdnanit[notatEAdnanit.length - 1]);
        //System.out.println(notatEAdnanit[10]);

        notatEAdnanit[0] = 8;
        notatEAdnanit[2] = 9;

        int nota1 = notatEAdnanit[1];
        System.out.println(nota1);


    }
}















