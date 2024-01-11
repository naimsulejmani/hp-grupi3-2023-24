package methods;

public class MethodSignature {
    public static void main(String[] args) {
        double shuma = sum(10, 20);
        shuma = sum(2.2f, 3);
        shuma = sum(2.3, 3.3);

        shuma = sum1(10, 4_000_000_000L);
        shuma = sum1(4_000_000_000L, 1);
    }

    public static int sum(int nr1, int nr2) {
        return nr1 + nr2;
    }

    public static long sum1(int nr1, long nr2) {
        return nr1 + nr2;
    }

    public static long sum1(long nr1, int nr2) {
        return nr1 + nr2;
    }

    public static float sum(float nr1, float nr2) {
        return nr1 + nr2;
    }

    public static double sum(double nr1, double nr2) {
        return nr1 + nr2;
    }
}












