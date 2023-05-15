package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;



public class Birthstones {
    public static void main(String[] args) {


        //declare variables


        int numMonth = 0;
        //initialize scanner
        Scanner myScanner = new Scanner(System.in);


        //prompt user


        do {
            System.out.println("What birthstone do you want to know?");
            numMonth = myScanner.nextInt();
            System.out.println("You chose: " + numMonth);
            switch (numMonth) {
                case 1:
                    System.out.println("January's birthstone is garnet");
                    break;
                case 2:
                    System.out.println("February's birthstone is amethyst");
                    break;
                case 3:
                    System.out.println("March's birthstone is aquamarine");
                    break;
                case 4:
                    System.out.println("April's birthstone is diamond");
                    break;
                case 5:
                    System.out.println("May's birthstone is emerald");
                    break;
                case 6:
                    System.out.println("June's birthstone is pearl");
                    break;
                case 7:
                    System.out.println("July's birthstone is ruby");
                    break;
                case 8:
                    System.out.println("August's birthstone is peridot");
                    break;
                case 9:
                    System.out.println("September's birthstone is sapphire");
                    break;
                case 10:
                    System.out.println("October's birthstone is opal");
                    break;
                case 11:
                    System.out.println("November's birthstone is topaz");
                    break;
                case 12:
                    System.out.println("December's birthstone is aquamarine");
                    break;
                default:
                    System.out.println("That's not a real month");
            }
        }while (numMonth > 12 || numMonth < 1) ;

    }

}











