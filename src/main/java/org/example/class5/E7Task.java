package org.example.class5;

import java.util.Scanner;

public class E7Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day number");
        int day=scanner.nextInt();
        if(day==1 || day==2 || day==3 || day==4 || day==5){
            System.out.println("It is a weekday");

        }else if(day==6 || day==7){
            System.out.println("it is a weekend");
        }else{
            System.out.println("Invalid day");
        }

        }

    }







