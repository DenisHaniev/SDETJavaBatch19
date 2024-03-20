package org.example.class5;

import java.util.Scanner;

//
public class E8LogicalNot {
    public static void main(String[] args) {
        //   !-этот знак переводит из правды в неправду и на оборот

        boolean box = false;
        box = !box;
        System.out.println(box);

        String country = "Iran";
        if (!country.equals("Iran")) {
            System.out.println("You can visit USA");
        } else {
            System.out.println("Not Allowed");
        }
    }
}



