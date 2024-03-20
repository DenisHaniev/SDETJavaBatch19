package org.example.class6;

////


import javax.swing.*;
import java.util.Scanner;

public class E10LoopsScaner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter the starting number  of the loop");
        int start=scanner.nextInt();
        System.out.println("Please Enter the ending number");
        int end=scanner.nextInt();
        System.out.println("Pleas Enter the step size ");
        int stepSize=scanner.nextInt();
        while (start<=end){

            System.out.println(start+" ");
            start=start+stepSize;
        }
        }
    }











