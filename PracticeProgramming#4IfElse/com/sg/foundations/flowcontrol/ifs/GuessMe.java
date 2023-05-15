package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args){
        //declare variables
        int num= 9;
        int guestnum= 0;

        //declare and initialize scanner
        Scanner myScanner= new Scanner(System.in);

        //prompt user to enter number


        //response
        do {
            System.out.println("I've chosen a number. Bet you can't guess it!");
            guestnum = myScanner.nextInt();
            System.out.println("Your guess: " + guestnum);
            if (guestnum < num) {
                System.out.println("Ha! Nice try, too low. I guessed " + num);
            } else if (guestnum > num) {
                System.out.println("Too bad. Too high. I chose " + num);
            } else if (guestnum == num) {
                System.out.println("Nice! I also chose " + num);
            }
        } while (guestnum != num);
         //
        //with a loop

        //how do i make it a repetition loop


        }
    }
