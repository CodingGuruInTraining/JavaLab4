package com.mark;
import java.util.ArrayList;

/**
 * This program goes over the basics of creating an
 * ArrayList and playing with it.
 */
public class problem_1 {
    public static void main(String[] args) {
        // Creates the ArrayList and adds initial values.
        ArrayList<String> cereals = new ArrayList<String>();
        cereals.add("Special K");
        cereals.add("Captain Crunch");
        cereals.add("Oatmeal");

        // Removes a specific item and then adds more.
        cereals.remove("Oatmeal");
        cereals.add("Cinnamon Toast Crunch");
        cereals.add("Cornflakes");
        System.out.println(cereals);

        // Loops through ArrayList looking for a string and
        // displays a message depending on outcome of search.
        boolean foundIt = false;
        for (String x : cereals) {
            if (x.equals("Special K")) {
                System.out.println("Special K has been found.");
                foundIt = true;
                break;
            }
        }
        if (foundIt == false) {
            System.out.println("No Special K here.");
        }
    }
}
