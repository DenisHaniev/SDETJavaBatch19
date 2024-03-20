package org.example.class8;

public class E1Break {

    public static void main(String[] args) {
        //search for the name (он ищет имя (находит его ) и не остановиться по кол-ву поиска.
        //Нам надо установить  break(для остановки поиска).

        String[] names = {"James", "Iram", "Matt Naughty", "Fab", "Aladin", "Ana", "Silvia"};

        for (String n:names) {
            if (n.equals("Fab")) {
                //System.out.println("Name is present");
                System.out.println(n+" is present");
                break;

            }
        }
    }
}


