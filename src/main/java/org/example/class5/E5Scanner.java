package org.example.class5;

import java.util.Scanner;

///  next is going to pick the first word and charAT(0) is going to pick the first letter from than word .
public class E5Scanner {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the gender m/f");
        char gender=scanner.next().charAt(0);
        System.out.println(gender);



        }
}

