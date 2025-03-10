# SUIT_Assinment_4_076
# Java Deck Simulation

## Overview
This Java program simulates a standard 52-card deck with various functionalities such as shuffling, printing, comparing, searching, and dealing cards. It is a menu-driven program that allows the user to interact with the deck.

## Files Included
- **Card.java** - Represents an individual playing card.
- **Deck.java** - Manages the deck and card operations.
- **Main.java** - Implements the menu-driven user interface.

## Card.java
This class represents a single playing card.

### Attributes:
- `rank` (String) → Stores the card rank (e.g., "2", "J", "A").
- `suit` (String) → Stores the card suit (e.g., "Hearts", "Spades").

### Methods:
Method: `Card(String rank, String suit)` - Constructor to initialize a card with a rank and suit.
Method: `getRank()` - Returns the rank of the card.
Method: `getSuit()` - Returns the suit of the card.
Method: `toString()` - Returns the card in "Rank of Suit" format (e.g., "10 of Hearts").

## Deck.java
This class manages the deck and provides various operations.

### Attributes:
- `deck` (ArrayList<Card>) → Stores the list of 52 playing cards.

### Methods:
Method: `Deck()` - Constructor that initializes the deck and calls `createDeck()`.
Method: `createDeck()` - Populates the deck with 52 unique cards.
Method: `printDeck()` - Prints all cards in the deck.
Method: `printCard(int index)` - Prints a specific card based on the given index (0-51).
Method: `sameCard(Card c1, Card c2)` - Returns `true` if two cards have the same suit.
Method: `compareCard(Card c1, Card c2)` - Returns `true` if two cards have the same rank.
Method: `findCard(String rank, String suit)` - Checks if a specific card exists in the deck.
Method: `shuffleDeck()` - Shuffles the deck randomly.
Method: `dealCard()` - Prints 5 random cards from the deck.

## Main.java
This file implements the menu-driven system allowing users to interact with the deck.

### Menu Options:
Option 1 - Print the entire deck.
Option 2 - Shuffle the deck.
Option 3 - Print a specific card by index.
Option 4 - Compare two cards (by suit and rank).
Option 5 - Search for a specific card.
Option 6 - Deal 5 random cards.
Option 7 - Exit the program.

### Main Method:
- Initializes a `Deck` object.
- Uses a `while` loop to display the menu.
- Reads user input and calls appropriate `Deck` methods.
