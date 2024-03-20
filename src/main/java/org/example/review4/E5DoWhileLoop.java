package org.example.review4;

import java.util.Scanner;

public class E5DoWhileLoop {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int number=0;
        do{
        System.out.println("Please enter the number");
        number= scanner.nextInt();

        }while (number<10);

        }
    }

