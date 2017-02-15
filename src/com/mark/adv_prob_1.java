package com.mark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by hl4350hb on 2/15/2017.
 */
public class adv_prob_1 {

    static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<String> cardDeck = makeDeck();
        int randomIndex = random.nextInt(cardDeck.size());
        String randomCard = cardDeck.get(randomIndex);
        System.out.println(randomCard);
    }



    public static ArrayList makeDeck() {
        ArrayList newDeck = new ArrayList();
        String[] newCard = new String[2];
        String[] allSuites = {"spades", "hearts", "diamonds", "clubs"};
        String[] allCards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String card : allCards) {
            for (String suite : allSuites) {
                newDeck.add(card + " of " + suite);
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