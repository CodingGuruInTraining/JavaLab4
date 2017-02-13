package com.mark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hl4350hb on 2/8/2017.
 */
public class problem_4 {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ArrayList> lakeTimes = new ArrayList<ArrayList>();
        System.out.println("What lake did you run?");
        String lake = stringScanner.nextLine();
        System.out.println("What was your time?");
        double time = numberScanner.nextDouble();
        ArrayList newRun = new ArrayList();
        newRun.add(lake);
        newRun.add(time);
        lakeTimes.add(newRun);
        for (int x = 0; x < lakeTimes.size(); x++) {
            ArrayList item = lakeTimes.get(x);
            if (item.get(0).equals(lake)) {
                System.out.println("Success!");
            }
        }


    }
}
// arraylist containing arrays[lake name, time]
// Arrays.sort(array)