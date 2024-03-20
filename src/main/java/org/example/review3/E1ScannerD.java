package org.example.review3;

import java.util.Scanner;

public class E1ScannerD {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        System.out.println("please enter your age");

        int age= scan.nextInt();
        /*
        we have created a variable int type and calling the nextint method to accept the int type data and
        storing it in the computer
         */

        if(age>50){
            /*it is looking at the condition weather it is true or false
            /*
            if
             */
            System.out.println("You will get discount on Toys");
        }else{
            System.out.println("You will get 10% discount");
        }

    }
}
