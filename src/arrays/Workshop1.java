package arrays;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Workshop1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj sa elemente i ka vargu: ");
        final int N = reader.nextInt();
        int[] array = new int[N];

        //pjesa e pare e detyres, mbushja me vlera random
        //shko per secilin element te vargut dhe ploteso me vlera random
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
//pjesa e dyte e detyres shtypja e numrave
        // nga indeksi i pare deri tek i fundit
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d", array[i]);
        }
        System.out.println();

//pjesa e trete e detyres shtypja e numrave
        //nga indeksi i fundit deri tek i pari

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.printf("%5d", array[i]);
        }

        System.out.println();
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.printf("%nShuma e numrave te vargut random eshte: %d%n"
                , sum);
    }
}











