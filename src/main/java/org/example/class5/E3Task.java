package org.example.class5;

import java.util.Scanner;

public class E3Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter city");
        String city = scanner.next();
        System.out.println("Please enter your temperature");
        double temperature = scanner.nextDouble();
        double tempCelsive = (temperature - 32) * 5.0 / 9.0;
        System.out.println("The temperature in city " + city + "is" + tempCelsive);

    }
}



