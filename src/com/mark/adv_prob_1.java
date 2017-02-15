package com.mark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by hl4350hb on 2/15/2017.
 */
public class adv_prob_1 {

    static Random random = new Random();
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String[]> cardDeck = makeDeck();
        String input = "";
            do {
                if (cardDeck.size() > 0) {
                    int randomIndex = random.nextInt(cardDeck.size());
                    String[] randomCard = cardDeck.get(randomIndex);
                    System.out.print("Random card: ");
                    System.out.println(randomCard[0] + " of " + randomCard[1]);
                    cardDeck.remove(randomIndex);
                    System.out.println("Press 'Y' to draw another random card.");
                    input = stringScanner.nextLine();
                }
                else {
                    System.out.println("No more cards in deck.");
                    input = "Get outta here!";
                }
            }
            while (input.equalsIgnoreCase("Y"));
    }



    public static ArrayList makeDeck() {
        ArrayList newDeck = new ArrayList();

        String[] allSuites = {"spades", "hearts", "diamonds", "clubs"};
        String[] allCards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String card : allCards) {
            for (String suite : allSuites) {
                // Reinitializing each time so it is a new object.
                String[] newCard = new String[2];
                newCard[0] = card;
                newCard[1] = suite;
                newDeck.add(newCard);
            }
        }
        for (int x = 0; x < 5; x++) {
            Collections.shuffle(newDeck);
        }
        return newDeck;
    }
}

//helpful sites:
//http://stackoverflow.com/questions/5034370/retrieving-a-random-item-from-arraylist