package org.example.class5;

import java.util.Scanner;

public class E10Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ");

        int number = scanner.nextInt();
        if (number >= 1 && number >= 9) {
            System.out.println("small");
        } else if (number >= 11 && number >= 99) {
            System.out.println("medium");
        } else if (number >= 101 && number >= 999) {
            System.out.println("good to go ");
        }
    }
}

//////Write a program that will ask user to input the current time (use 24 hour format).
//Based on the given time define:
//if hour is between 1-11 --> Morning
//if hour between 12-15 --> Afternoon
//if hour between 16-20 --> Evening
//if hour between 21-24 --> Night
//If anything else print invalid







