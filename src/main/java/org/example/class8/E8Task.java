package org.example.class8;

import com.sun.jdi.CharType;

public class E8Task {

    public static void main(String[] args) {

        String[][] studentData = {
                {"Lana", "Ana", "Maggy", "Denis"},
                {"A", "B", "C", "D"},
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (studentData[i][j].equals("A") || studentData[i][j].equals("B")) {
                    System.out.println(studentData[0][2]);
                }
            }
        }
    }
}








//Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
// Then your program should print name of the students that has A and B grade












