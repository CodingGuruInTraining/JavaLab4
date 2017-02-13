package com.mark;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> myClasses = new ArrayList<String>();
        myClasses.add("Java");
        myClasses.add("Web Development");
        myClasses.add("Communication");
        System.out.println(myClasses);


        for (String x : myClasses) {

        }
        System.out.println();
    }
}
