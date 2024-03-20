package org.example.class7;

public class E5Arrays {
    public static void main(String []args){
        //

        double[] prices={10.5,20.5,25,30};
        //0 1 2 3  мы задем формулу от 0 до 3/ если на выходе [i] -получис бокс с числами от 0 до 3
        // если на выходе поставить price[i] тогда мы поличим числа заданые в double
        for(int i=0;i<4;i++){
            System.out.println(prices[i]);
        }
    }
}
