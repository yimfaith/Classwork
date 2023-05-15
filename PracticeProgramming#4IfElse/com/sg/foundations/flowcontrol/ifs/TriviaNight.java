package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;

public class TriviaNight {
    public static void main(String[] args){
        System.out.println("It's trivia night! Are you ready?");
        //declare variables
        int correct=0;
        int answer=0;


        //initialize scanner
        Scanner myScanner = new Scanner(System.in);

        //print question and prompt user for input
        //Question 1
        do {
            System.out.println("First Question");
            System.out.println("What is the lowest level programming language");
            System.out.println("#1 Source Code");
            System.out.println("#2 Assembly Language");
            System.out.println("#3 C++");
            System.out.println("#4 Machine Language");
            answer = myScanner.nextInt();
            System.out.println("Your Answer: " + answer);
            if (answer == 4) {
                System.out.println("Nice!");
                correct = correct + 1;
            } else if (answer == 1) {
                System.out.println("Hmmm");
            } else if (answer == 2) {
            System.out.println("Hmmm");
            } else if (answer == 3) {
            System.out.println("Hmmm");
            } else
            System.out.println("That's not a real answer, please try again");
        }while (answer >4 || answer < 1);

        //Question 2
        System.out.println("Second Question");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("#1 Grace Hopper");
        System.out.println("#2 Alan Turing");
        System.out.println("#3 Charles Babbage");
        System.out.println("#4 Larry Page");
        answer = myScanner.nextInt();
        System.out.println("Your Answer: " + answer);
        if (answer==2) {
            System.out.println("Nice!");
            correct = correct + 1;
        }
        else {
            System.out.println("Hmmm");
        }

        //Question 3
        System.out.println("Last Question");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.println("#1 Serenity");
        System.out.println("#2 The Battlestar Galactica");
        System.out.println("#3 The USS Enterprise");
        System.out.println("#4 The Milenium Falcon");
        answer = myScanner.nextInt();
        System.out.println("Your Answer: " + answer);
        if (answer==3) {
            System.out.println("Nice!");
            correct = correct + 1;
        }
        else {
            System.out.println("Hmmm");
        }

        //Final Tally
        if (correct>1) {
            System.out.println("Nice job! You got " + correct + " correct!");
        }
        else {
            System.out.println("Ah, better luck next time!");
        }




    }
}
