package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;

public class FieldDay {
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    String team;

    System.out.println("What's your last name? ");
    String lastName = myScanner.nextLine().toLowerCase();
    if (lastName.compareTo("baggins") <= 0) {
        team = "Red Dragons";
    } else if (lastName.compareTo("dresden") <= 0) {
        team = "Dark Wizards";
    } else if (lastName.compareTo("howl") <= 0) {
        team = "Moving Castles";
    } else if (lastName.compareTo("potter") <= 0) {
        team = "Golden Snitches";
    } else if (lastName.compareTo("vimes") <= 0) {
        team = "Night Guards";
    } else {
        team = "Black Holes";
    }

    System.out.println("Aha! You're on the team \"" + team + "\"!");
    System.out.println("Good luck in the games!");


    }
}
