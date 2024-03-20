package org.example.class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        //Scanner scan= new Scanner(System.in) creating the object

        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter your age");
        // we are calling the nextInt method to take the input from the keybord
        int age=scan.nextInt();
        System.out.println("you are "+age+" years old");


    }
}
