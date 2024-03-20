package org.example.class7;

public class A9Task {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 80};
        int max = numbers[0];
        for (int n : numbers) {
            if (max <n){
                max =n;
            }
        }
        System.out.println(max);
    }
}







