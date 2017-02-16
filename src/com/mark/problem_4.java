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

//        for (String key : lakesAndTimes.keySet()) {
//            if (lake.equalsIgnoreCase(key)) {
//
//            }
//        }

//        ArrayList newRun = new ArrayList();
//        newRun.add(lake);
//        newRun.add(time);
//        lakeTimes.add(newRun);
//        for (int x = 0; x < lakeTimes.size(); x++) {
//            ArrayList item = lakeTimes.get(x);
//            if (item.get(0).equals(lake)) {
//                System.out.println("Success!");
//            }
//        }


    }
}
// arraylist containing arrays[lake name, time]
// NO!
// dictionary containing ONE arraylist of times; key is lake
// Arrays.sort(array)