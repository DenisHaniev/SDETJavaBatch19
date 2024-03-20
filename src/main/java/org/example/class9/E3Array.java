package org.example.class9;

public class E3Array {
    public static void main(String[] args) {

        int [] number={10,25,45,66,85,100};

        for (int i=number.length-1; i>=0; i--) {
        //for (int i = 5; i >=0; i--){ реверс

        System.out.println(i+" "+number[i]+" ");
        }
    }
}
