import java.util.*;

class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
    }

    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid card index.");
        }
    }

    public boolean sameSuit(Card c1, Card c2) {  // Renamed for clarity
        return c1.getSuit().equalsIgnoreCase(c2.getSuit());
    }

    public boolean sameRank(Card c1, Card c2) {  // Renamed for clarity
        return c1.getRank().equalsIgnoreCase(c2.getRank());
    }

    public boolean findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                return true;
            }
        }
        return false;
    }

    public void dealCard() {
        if (deck.size() < 5) {  // Prevents IndexOutOfBoundsException
            System.out.println("Not enough cards to deal.");
            return;
        }
        Collections.shuffle(deck);
        System.out.println("Five Random Cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled.");
    }
}
