package arrays.multi;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] vargu = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < vargu.length; i++) {
            System.out.printf("%4d", vargu[i]);
        }
        System.out.println();
        // per cdo numer te tipit int qe gjendet ne varg,
        //shtype numrin e vargut
        for (int numer : vargu) {
            System.out.printf("%4d", numer);
        }



    }
}















