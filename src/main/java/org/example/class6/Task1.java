package org.example.class6;

import org.example.class1.Main;

import java.util.Scanner;
import java.util.SortedMap;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter you country name");
        String country=scanner.nextLine();
        switch (country){
            case "USA":
                System.out.println("We speak English");
                break;
            case "Spain":
                System.out.println("We speak Spanish");
                break;
            case "Ukraine":
                System.out.println("We speak Ukrainian");
                break;
            case"Egypt":
                System.out.println("We speak Arabic");
                break;
            default:
                System.out.println("Country not support");

        }
    }
}
