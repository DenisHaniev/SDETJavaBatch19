package org.example.class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        //Scanner scan= new Scanner(System.in) creating the object

        Scanner scan= new Scanner(System.in);

        System.out.println("Please Enter your name");
        String name= scan.toString();

        System.out.println("Please Enter your age");
        int age= scan.nextInt();

        System.out.println("Please Enter your salary");
        double salary= scan.nextDouble();
        
        
        

    }
}
