package org.example.class8;

public class E2BreakContinue {

    public static void main(String[] args) {

        int[] numbers = {10, 60, 30, 55, 45, 35, 50, 100};
            for (int num : numbers) {
                //  Если он нашел число >50  внашем случае(60)пропустить калькуляцию  и продолжет с числа 30
                //30 меньше 50
                if(num>50){
                    continue;
                }
            System.out.println(num + 10);
            System.out.println(num - 10);
            System.out.println(num * 10);
            System.out.println(num / 10);
            System.out.println(num % 10);
            System.out.println("*****");

        }
    }
}




