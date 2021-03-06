package com.mark;

import java.util.*;

/**
 * This program is a imitation of the classic Go Fish game.
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

        // Creates HashMap that will hold all the player objects and their
        // card objects.
        HashMap all_players_cards = new HashMap();

        // Runs function to generate a deck of cards.
        ArrayList<String[]> cardDeck = makeDeck();

        // Loops through the number of players and draws 5 random cards
        // from deck.
        for (int x = 1; x <= player_Count; x++) {
            ArrayList<String[]> player_hand = dealCardsToHand(cards_per_Player, cardDeck);
            all_players_cards.put(x, player_hand);

            // Displays all cards in the player's hand.
            String player_hand_string = makeHandString(player_hand);
            System.out.println("Player #" + x + ":");
            System.out.println(player_hand_string);

            // Prompts user for card number they are looking for
            System.out.println("What cards are you looking for? (1-13)");
            int wanted_cards = numberScanner.nextInt();
            // Displays generic response.
            System.out.println("I don't have any of those. GO FISH!");

            //      to be continued...
        }
    }

    // Function for creating deck of cards. Copied over from
    // adv_prob_1.
    public static ArrayList makeDeck() {
        // Creates new ArrayList to hold cards.
        ArrayList newDeck = new ArrayList();
        // Creates static arrays of each suite name and each card type.
        String[] allSuites = {"spades", "hearts", "diamonds", "clubs"};
        String[] allCards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King"};
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

    // Initial cards are drawn and placed in ArrayList.
    public static ArrayList dealCardsToHand(int cards_per_Player, ArrayList cardDeck) {
        ArrayList<String[]> player_hand = new ArrayList<String[]>();
        for (int i = 0; i < cards_per_Player; i++) {
            String[] aCard = drawCard(cardDeck);
            player_hand.add(aCard);
        }
        return player_hand;
    }

    // Simple function that makes a printable list of cards.
    public static String makeHandString(ArrayList<String[]> player_hand) {
        String hand = "";
        // Loops through cards and combines values in array.
        for (String[] card : player_hand) {
            hand += card[0] + " " + card[1] + ", ";
        }
        // Removes trailing separator.
        hand = hand.substring(0, hand.length() - 2);
        return hand;
    }
}

//  single card = String[] >>>
//  players hand = ArrayList<String[]> >>>
//  players = dictionary {#:ArrayList}