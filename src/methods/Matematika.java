package methods;

public class Matematika {
    public static void main(String[] args) {
        int maximum = max(100, 200);
        System.out.println(maximum);
        System.out.println(max(200, 300));

        maximum = max(3, 4) * 5 + 1;
        System.out.println(maximum);

        //System.out.println(MethodSignature.sum(20,30));

    }

    public static int max(int x, int y) {
        if (x > y) return x;
        else return y;
    }


}








