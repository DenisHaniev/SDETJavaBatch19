package org.example.class4;

public class E8IfElselfTask {
    public static void main(String[] args) {

        int num1=9;
        int num2=8;
        int num3=7;


        if(num1>num2) {
            if (num1 > num3)
                System.out.println("is the largest number");
        }else if(num2 > num1) {
            if (num2 > num3)
                System.out.println("is the largest number");
        }else if(num3 > num1){
            if(num3 > num2)
                System.out.println("is the largest number");
        }

        }

    }

