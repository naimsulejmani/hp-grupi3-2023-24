package decision_selection;

public class StringComparison {
    public static void main(String[] args) {
        String emri1 = "Naim";
        String emri2 = "NAIM";
        String emri3 = "Naimi";
        String emri4 = "Z";

        System.out.println(emri1.equals(emri1));
        System.out.println(emri1.equals(emri2));
        System.out.println(!emri1.equals(emri2));
        System.out.println(emri1.equalsIgnoreCase(emri2));

        System.out.println("A".equals("B"));


        System.out.println("ABAZ".compareTo("Blerina"));
        System.out.println("Blerina".compareTo("ABAZ"));
        System.out.println("Abetare".compareTo("Z"));

    }
}
















