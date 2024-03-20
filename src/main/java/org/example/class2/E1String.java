package org.example.class2;

public class E1String {
    public static void main(String[] args) {
        String name="Denis";
        System.out.println(name);

        String firstName="Denis";
        String lastName="Haniev";
        String space=" ";

        //String fullName=firstName+" "+lastName;  String fullName=firstName+space+lastName;
        // для написания с пробелом  есть два варианта
        String fullName=firstName+space+lastName;
        System.out.println(fullName);

    }
}
