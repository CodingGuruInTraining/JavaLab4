package com.mark;

import java.util.*;

/**
 * Created by hl4350hb on 2/8/2017.
 */
public class problem_4 {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, ArrayList> lakeTimesHash = new HashMap();


        System.out.println("What lake did you run?");
        String lake = stringScanner.nextLine();
        System.out.println("What was your time?");
        double time = numberScanner.nextDouble();

        if (lakeTimesHash.containsKey(lake)) {
            lakeTimesHash.get(lake).add(time);
        }
        else {
            ArrayList<Double> lakeTimesArray = new ArrayList<Double>();
            lakeTimesArray.add(time);
            lakeTimesHash.put(lake, lakeTimesArray);
        }

        System.out.println("Your fastest times have been updated:");
        System.out.println("LAKE\tTIME");
// ##########   Need to calculate max ###########
        for (String key : lakeTimesHash.keySet()) {
            System.out.println(key + ":  " + lakeTimesHash.get(key));
        }

    }

    public static Double findMax(ArrayList<Double> aList) {
        return Collections.max(aList);
    }
}
