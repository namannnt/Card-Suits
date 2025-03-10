import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.createDeck();

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Print Specific Card");
            System.out.println("4. Compare Two Cards");
            System.out.println("5. Find a Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    deck.shuffleDeck();
                    break;
                case 3:
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 4:
                    System.out.print("Enter first card (rank suit): ");
                    String rank1 = scanner.next();
                    String suit1 = scanner.next();
                    System.out.print("Enter second card (rank suit): ");
                    String rank2 = scanner.next();
                    String suit2 = scanner.next();
                    Card card1 = new Card(rank1, suit1);
                    Card card2 = new Card(rank2, suit2);
                    System.out.println("Same Suit? " + deck.sameSuit(card1, card2)); // Fixed method call
                    System.out.println("Same Rank? " + deck.sameRank(card1, card2)); // Fixed method call
                    break;
                case 5:
                    System.out.print("Enter card to find (rank suit): ");
                    String findRank = scanner.next();
                    String findSuit = scanner.next();
                    boolean found = deck.findCard(findRank, findSuit);
                    System.out.println(found ? "Card found!" : "Card not found.");
                    break;
                case 6:
                    deck.dealCard();
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
