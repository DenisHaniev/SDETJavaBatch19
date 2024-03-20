package org.example.class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your credit score");
        int score= scan.nextInt();
        System.out.println("Your credit score is "+score);

        if(score >0 ){
            if(score>=800){
                System.out.println("Your rate is 6% ");
            }else if(score<800 && score>=700){
                System.out.println("Your rate is 8% ");
            }else if(score>650 && score<700){
                System.out.println("Your rate is 10% ");
            }

        }else{
            System.out.println("Your loan has not been approved");
        }




    }
}
