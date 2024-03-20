package org.example.class8;

public class E6_2DArraysLoops {

    public static void main(String[] args) {


              /*
                   0   1  2  3 -Colum
             0 ROW 10 20 40 50
             1 ROW 22 40 90 65
             2 ROW 15 50 33 30
                        */

        int[][] matrix = {
                {10, 20, 40, 50},
                {22, 40, 90, 65},
                {15, 50, 33, 30}
        };

        for (int i = 0; i < 3; i++) {   // j<7 ROWS  aftor loop
            for (int j = 0; j < 4; j++) {  // i<4 Coloms interloop
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}










