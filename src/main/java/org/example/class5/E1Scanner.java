package org.example.class5;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[]args){

        /* Scanner => is a non-primitive data type
        scan => is just a variable name
        = simple the assigment operator

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        if(age>18){
        System.out.println("You can voit");
    }else{
            System.out.println("You need to wait");
        }
}
}
