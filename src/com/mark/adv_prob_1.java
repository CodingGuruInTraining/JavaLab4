package com.mark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * This program creates a deck of cards and then draws a random one
 * until the User decides not to draw another or no more cards are
 * left in the deck.
 */
public class adv_prob_1 {

    // Creates Random and Scanner objects.
    static Random random = new Random();
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Runs function to create an ArrayList of arrays
        // that uniquely represents cards in a deck.
        ArrayList<String[]> cardDeck = makeDeck();
        // Creates string variable that both do and while
        // can access.
        String input = "";
            // Loops while a condition is true.
            do {
                // Checks that there are still cards to draw.
                if (cardDeck.size() > 0) {
                    // Gets a random number to use as index.
                    int randomIndex = random.nextInt(cardDeck.size());
                    // Draws a random card from deck.
                    String[] randomCard = cardDeck.get(randomIndex);
                    // Displays card.
                    System.out.print("Random card: ");
                    System.out.println(randomCard[0] + " of " + randomCard[1]);
                    // Removes card from deck so that it can't be
                    // drawn again.
                    cardDeck.remove(randomIndex);
                    // Prompts User whether to continue.
                    System.out.println("Press 'Y' to draw another random card.");
                    input = stringScanner.nextLine();
                }
                else {
                        // Displays message when no more cards are
                        // available.
                        System.out.println("No more cards in deck.");
                        input = "Get outta here!";
                }
            }
            while (input.equalsIgnoreCase("Y"));
    }


    // Function for creating deck of cards.
    public static ArrayList makeDeck() {
        // Creates new ArrayList to hold cards.
        ArrayList newDeck = new ArrayList();
        // Creates static arrays of each suite name and each card type.
        String[] allSuites = {"spades", "hearts", "diamonds", "clubs"};
        String[] allCards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        // Loops through both arrays and creates a new array
        // with a unique combination.
        for (String card : allCards) {
            for (String suite : allSuites) {
                // Reinitializing each time so it is a new object.
                String[] newCard = new String[2];
                newCard[0] = card;
                newCard[1] = suite;
                newDeck.add(newCard);
            }
        }
        // Shuffles ArrayList 5 times.
        for (int x = 0; x < 5; x++) {
            Collections.shuffle(newDeck);
        }
        return newDeck;
    }
}

//helpful sites:
//http://stackoverflow.com/questions/5034370/retrieving-a-random-item-from-arraylist