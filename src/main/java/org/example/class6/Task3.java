package org.example.class6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please  enter number1 ");
        double number1 = scanner.nextDouble();
        System.out.println("Please  enter number1");
        double number2 = scanner.nextInt();
        System.out.println("Please enter operators");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("The result is " + (number1 + number2));
                break;
            case '-':
                System.out.println("The result is " + (number1 - number2));
                break;
            case '*':
                System.out.println("The result is " + (number1 * number2));
                break;
            case '/':
                System.out.println("The result is" + (number1 / number2));
                break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}

/////Allow user to enter grade (A, B, or C etc...) and
//then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
//any other grade --> Not Acceptable. At the end your program should
//print which grade was entered by a user with explanation.
