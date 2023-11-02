package operatoret_aritmetik;

public class StringExample {
    public static void main(String[] args) {
        String name = "Filan";
        String surname = "Fisteku";
        String fullName = name + " " + surname;
        System.out.println(fullName);

        int x = 4;
        int y = 2;
        String point = "(" + x + ", " + y + ")";
        System.out.println(point);

        String text = "Kur kam qene nje vakt i ri";
        System.out.println("Gjatesia e tekstit " + text.length() + " karaktere!");
        System.out.println("Shkronja e pare e tekstit eshte: " + text.charAt(0));
        System.out.println("Shkronja e fundit e tekstit eshte: " + text.charAt(text.length() - 1));
    }
}









