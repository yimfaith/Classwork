package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args) {
        //initialize variables
        int year = 0;
        String name = " ";

        //initialize scanner
        Scanner myScanner = new Scanner(System.in);

        //prompt user for name and year born
        System.out.println("Hello! What's your name? ");
        name = myScanner.nextLine();
        System.out.println("Hello " + name + "!" + " When is your birthday? ");
        year = myScanner.nextInt();
        System.out.println("Your birthday is " + year + "?");

        // if statements for year name
        if (year < 2005)
            {System.out.println("Pixar's 'Up' came out over a decade ago.");}
        if (year < 1995)
            {System.out.println("the first Harry Potter came out over 15 years ago.");}
        if (year < 1985)
            {System.out.println("Space Jam came out not last decade, but the one before THAT.");}
        if (year < 1975)
            {System.out.println("the original Jurassic Park release is closer to the first lunar landing than it is to today.");}
        if (year < 1965)
            {System.out.println("he MASH TV series has been around for almost half a century!");}

//for year 1980, need to display all the other items that also are included


        }
    }
