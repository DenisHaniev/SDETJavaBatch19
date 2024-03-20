package org.example.class4;

public class E1IfElself {
    public static void main(String[] args){

        int age=35;
        double wage=120;
        if(age > 18){
            if(wage > 110) {
                System.out.println("you are eligeble to donate blood");
            }else {
                System.out.println("you wage is not allowed");
            }

            }else{
            System.out.println("we cannot accept such a patient");
        }

    }
}

