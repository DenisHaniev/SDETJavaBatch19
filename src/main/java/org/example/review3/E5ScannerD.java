package org.example.review3;

import java.util.Scanner;

public class E5ScannerD {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
       // if someone is less than 10 years old or someone is older than 50 give  20% discont.

        int age=10;

        if(age<10 || age>50){
            System.out.println("You will get 20% discount");
        }else{
            System.out.println("No discount");
        }

        }

    }

