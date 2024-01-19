package arrays;

public class Letrat {
    public static void main(String[] args) {

        String[] ranks =
                {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //{"\u2663", "\u2666", "\u2665", "\u2660"};
        String[] suits = {"♣", "♦", "♥", "♠"};

        String[] fullDeck = new String[ranks.length * suits.length];

        int deckCounter = 0;
        for (int j = 0; j < ranks.length; j++) {
            for (int i = 0; i < suits.length; i++) {
                fullDeck[deckCounter++] = ranks[j] + suits[i];
            }
        }

        for (int i = 0; i < fullDeck.length; i++) {
            System.out.printf("%3s", fullDeck[i]);
        }

        int randomIndex = (int) (Math.random() * 52); // 0..51.99999
        System.out.printf("%n%nLetra random qe e keni zgjedhur eshte: %s%n",
                fullDeck[randomIndex]);
    }
}















