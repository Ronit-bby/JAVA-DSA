package com.RONITBBY.DAY42;

public class hard {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {5, 9, 4},
                {8, 6, 2}
        };

        int rowNum = 1;
        for (int[] row : matrix) {
            int max = row[0];
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Largest in row " + rowNum + " = " + max);
            rowNum++;
        }
    }
}

