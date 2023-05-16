package com.sg.foundations.flowcontrol.methods;
import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args) {
        String color = randColor(); // call color method here
        String animal = randAn(); // call animal method again here
        String colorAgain =randColor(); // call color method again here
        int weight = randNum(5,200); // call number method,
        // with a range between 5 - 200
        int distance = randNum(10,20); // call number method,
        // with a range between 10 - 20
        int number = randNum(1000,2000); // call number method,
        // with a range between 10000 - 20000
        int time = randNum(2,6); // call number method,
        // with a range between 2 - 6
        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }
    public static String randColor() {
        Random rng = new Random();

        String[] colors = {"red", "blue", "orange", "yellow", "pink"};
        int randomIndex = rng.nextInt(colors.length);
        return colors[randomIndex];
    }
    public static String randAn() {
        Random rng = new Random();

        String[] animal = {"bear", "dog", "cat", "giraffe", "pig"};
        int randomIndex = rng.nextInt(animal.length);
        return animal[randomIndex];
    }

    public static int randNum(int min, int max) {
        Random rng = new Random();
        return rng.nextInt((max-min) + 1) + min;

    }



}
