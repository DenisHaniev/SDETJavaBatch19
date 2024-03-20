package org.example.class7;

import java.util.Arrays;

public class A1Task {
    public static void main(String []args){
        //
        char[] grades=new char[4];
        //Storing the letter A inside the box 0
        //в этом варианте мы можем поставить на печать все заданые велечины

        grades[0]='A';
        grades[1]='B';
        grades[2]='C';
        grades[3]='D';
        //WE ONLY HAVE FOUR BOXES LAST  box is at index 3
        //grades[4]='F';
        System.out.println(Arrays.toString(grades));


        

    }
}
