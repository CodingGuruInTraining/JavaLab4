package com.mark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * This program prompts user for inputs and adds these values
 * to a HashMap.
 */
public class problem_4 {
    // Creates Scanner objects.
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Creates HashMap object.
        HashMap<String, ArrayList> lakeTimesHash = new HashMap();

        // Displays prompt for User and captures inputs
        // in separate variables.
        System.out.println("What lake did you run?");
        String lake = stringScanner.nextLine();
        System.out.println("What was your time?");
        double time = numberScanner.nextDouble();

        // Runs function that adds inputs to HashMap.
        addToList(lakeTimesHash, lake, time);

        // Displays message and 'column headers' for results.
        System.out.println("Your fastest times have been updated:");
        System.out.println("LAKE\tTIME");

        // Loops through HashMap and displays lowest value.
        for (String key : lakeTimesHash.keySet()) {
            double min = findMin(lakeTimesHash.get(key));
            printMax(key, min);
        }
    }

    // Function that adds parameters to HashMap.
    public static void addToList(HashMap hash, String input, double time) {
        // Checks if ArrayList exists with same key.
        if (hash.containsKey(input)) {
            // Adds time to ArrayList.
            ArrayList<Double> lakeList = (ArrayList)hash.get(input);
            lakeList.add(time);
        }
        else {
            // Creates new ArrayList if one does not exist.
            ArrayList<Double> lakeTimesArray = new ArrayList<Double>();
            lakeTimesArray.add(time);
            // Adds ArrayList to HashMap.
            hash.put(input, lakeTimesArray);
        }
    }

    // Function that finds the minimum value in ArrayList.
    public static double findMin(ArrayList<Double> aList) {
        return Collections.min(aList);
    }

    // Function that displays results.
    public static void printMax(String key, double min) {
        System.out.println(key + " : " + min);
    }
}
