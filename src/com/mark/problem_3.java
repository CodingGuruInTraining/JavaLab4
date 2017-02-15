//package com.mark;
//import java.util.Scanner;
//import java.util.ArrayList;
//
///**
// * This program receives input values from the User and
// * displays information from the data.
// */
//public class problem_3 {
//    // Creates Scanner object
//    static Scanner numberScanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        // Creates an accumulator and an empty array for
//        // collecting the inputs.
//        int crates = 0;
//        int houses = 8;
//        ArrayList<Integer> cratesData = new ArrayList<Integer>();
//        // Loops through array length and asks User for
//        // inputs. The data is added to the array and
//        // accumulator.
//        for (int x = 0; x < houses; x++) {
//            System.out.println("How many recycling crates are " +
//                    "set out for House #" + x + "?");
//            int input = numberScanner.nextInt();
//            crates += input;
//            cratesData.add(input);
//        }
//        // Runs function to get largest number of crates.
//        int[] maxResults = findMax(cratesData);
//        // Runs function to get smallest number of crates.
//        int min = findMin(cratesData, maxResults[0]);
//
//        // Displays results to the User.
//        System.out.println("There are " + crates + " total " +
//                "on this street.");
//        System.out.println("The largest number of crates is " +
//                maxResults[0] + ".");
//        System.out.println("The smallest number of crates is " +
//                min + ".");
//        System.out.println("House #" + maxResults[1] + " had " +
//                "the most recycling crates.");
//    }
//
//    // Function to determine largest value.
//    public static int[] findMax(ArrayList<Integer> list) {
//        // Creates variables to hold values.
//        int max = 0;
//        int house = 0;
//        // Loops through array and compares item to the current
//        // variables above.
//        for (int x = 0; x < list.size(); x++) {
//            if (list.get(x) > max) {
//                max = list.get(x);
//                house = x;
//            }
//        }
//        // Returns a new array of both variables
//        int[] results = {max, house};
//        return results;
//    }
//
//    // Function to determine smallest value.
//    public static int findMin(ArrayList<Integer> list, int max) {
//        // Sets new variable to the provided max.
//        int min = max;
//        // Loops through array and compares item to the current
//        // min variable above.
//        for (int x : list) {
//            if (x < min) {
//                min = x;
//            }
//        }
//        // Returns variable after loop.
//        return min;
//    }
//}
