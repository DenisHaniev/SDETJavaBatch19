package org.example.class5;

import java.util.Scanner;

public class E5Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your number of worked year");
        double year = scanner.nextDouble();
        if (year >= 5) {
            System.out.println("Enter your annual salary");
            double salary = scanner.nextDouble();
            System.out.println("you are eligible for the bonus");
            if (salary > 50000) {
                System.out.println("your bonus is 30000");

            }
        } else {
            System.out.println("You are not eligible to get a bonus");
        }
    }
}






