package org.example.class5;

import java.util.Scanner;

public class E1Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Loan need");
        int amount = scanner.nextInt();
        if(amount <= 2000000){
        System.out.println("approved");
        }else{
            System.out.println("reject");
        }
    }
}

