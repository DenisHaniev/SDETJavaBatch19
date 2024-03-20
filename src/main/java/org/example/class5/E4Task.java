package org.example.class5;

import java.util.Scanner;

public class E4Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have the credit cart");
        String haveCreditCard = scanner.next();
        if (haveCreditCard.equalsIgnoreCase("Yes")) {
            System.out.println("What is the balance on the cart");
            double balance = scanner.nextDouble();
            if (balance > 10000) {
                System.out.println("pay off spend more");
            } else {
                System.out.println("We can offer you the credit cart");

            }
        }
    }
}




