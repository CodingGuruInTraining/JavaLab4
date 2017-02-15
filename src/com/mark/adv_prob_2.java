package com.mark;

import java.util.*;


// BRAINSTORMING!!!
//  single card = String[] >>>
//  players hand = ArrayList<String[]> >>>
//  players = dictionary {#:ArrayList}
//



/**
 * Created by hl4350hb on 2/15/2017.
 */
public class adv_prob_2 {
        // Creates a Random object to randomly pick numbers
        static Random random = new Random();
        // Creates a Scanner object
        static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Creates variable holding number of cards each player will receive
        int cards_per_Player = 5;
        int player_Count = 2;
        // Creates string array to hold the player's cards
//        String[] players_hand = new String[cards_per_Player];

        HashMap all_players_cards = new HashMap();

        ArrayList<String[]> cardDeck = makeDeck();

        ArrayList<String[]> player_hand = new ArrayList<String[]>();
        for (int x = 1; x <= player_Count; x++) {
            for (int i = 0; i < cards_per_Player; i++) {
                String[] aCard = drawCard(cardDeck);
                player_hand.add(aCard);



//            // To make it simple, the suite is determined by the range
//            // the number picked is in. Also, the face cards are
//            // represented as a number for now.
//            int card = random.nextInt(52);
//            if (card <= 12) {
//                players_cards[i] = String.format("%d of Spades", card + 1);
//            }
//            // Number subtracts a multiple of 13 (number of cards per suite) and
//            // adds one to offset the base-0.
//            else if (card >= 13 && card <= 25) {
//                players_cards[i] = String.format("%d of Diamonds", (card - 13) + 1);
//            }
//            else if (card >= 26 && card <= 38) {
//                players_cards[i] = String.format("%d of Clubs", (card - 26) + 1);
//            }
//            else if (card >= 39) {
//                players_cards[i] = String.format("%d of Hearts", (card - 39) + 1);
            }
            all_players_cards.put(x, player_hand);
        }
    }



//        // Displays all cards in the player's hand.
//        System.out.println(Arrays.toString(players_cards));
//        // Prompts user for card number they are looking for
//        System.out.println("What cards are you looking for? (1-13)");
//        int wanted_cards = numberScanner.nextInt();
//        // Displays generic response.
//        System.out.println("I don't have any of those. GO FISH!");


    // Function for creating deck of cards. Copied over from
    // adv_prob_1.
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
        // Shuffles ArrayList 5 times to be thorough.
        for (int x = 0; x < 5; x++) {
            Collections.shuffle(newDeck);
        }
        // Returns ArrayList.
        return newDeck;
    }

    public static String[] drawCard(ArrayList<String[]> cardDeck) {
        // Picks a random number that will be the index number.
        int randomIndex = random.nextInt(cardDeck.size());
        // Pulls the random item from ArrayList.
        String[] aCard = cardDeck.get(randomIndex);
        // Removes item from ArrayList so can't be drawn again.
        cardDeck.remove(randomIndex);
        // Returns card array.
        return aCard;
    }
}

