package decision_selection;

public class SymbolComparison {
    public static void main(String[] args) {
        char shkronja = 'H';

        if (shkronja >= 'A' && shkronja <= 'Z') {
            System.out.println("Eshte shkronje  e madhe");
        } else if (shkronja >= 'a' && shkronja <= 'z') {
            System.out.println("Eshte shkronje e vogel");
        } else if (shkronja >= '0' && shkronja <= '9') {
            System.out.println("Eshte nje numer");
        } else {
            System.out.println("Eshte ndonje simbol apo shkronje speciale");
        }
    }
}
