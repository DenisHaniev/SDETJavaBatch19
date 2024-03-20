package org.example.class5;

import java.util.Scanner;

public class E6Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your heights in inches");
        int number=scanner.nextInt();
        if(number<60){
            System.out.println("short");
        }else if(number>72) {
            System.out.println("tall");
        }else if(number<=60 || number>=72){
            System.out.println("medium");
        }


        }
    }







