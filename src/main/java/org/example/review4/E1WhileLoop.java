package org.example.review4;

public class E1WhileLoop {
    public static void main(String[] args) {
        //1)condition (true or false).
        //This is true condition - it will repeat again and again.
        //when we add name MATT -computer check 1,2,3 line (true ) 4 line (false) it stop because it false
        // and print just ones Hello java .

        String name="Josh";
        while (name.equals("Josh")){
            System.out.println("Hello Java");
            name="Matt";

        }
    }
}
