package org.example.review3;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class E3ScannerD {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        System.out.println("Please enter Your Name");
        String name= scan.nextLine();
        System.out.println("Please Enter the color that you like");
        String color=scan.nextLine();
        System.out.println(name+" "+color);

        if(color.equalsIgnoreCase("Blue")){

        if(name.equalsIgnoreCase("Ana")){
            System.out.println("I am  avery good ");
        }else{
            System.out.println("I am will");

        }
        }else{
            System.out.println("You are very boring");
        }

    }
    }

