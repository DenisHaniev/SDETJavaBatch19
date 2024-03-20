package org.example.class5;

import java.util.Scanner;

//
public class E12TaskLogical {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            System.out.println("Plase Enter your age");
            int age=scanner.nextInt();
            System.out.println("Please Enter your Full Name");
            scanner.nextLine();
            String fullname= scanner.nextLine();
            System.out.println("Your name is "+fullname+" you are "+age+" year old");

    }
}






