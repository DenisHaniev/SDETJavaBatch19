package org.example.class5;

import java.util.Scanner;

public class E8Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number and then categorize");
        int  number =scanner.nextInt();
        if(number >=1 && number >=9){
            System.out.println("small");
        }else if(number >=11 && number>=99){
            System.out.println("medium");
        }else if(number >=101 && number>=999){
            System.out.println("good to go ");
        }

        }

        }







