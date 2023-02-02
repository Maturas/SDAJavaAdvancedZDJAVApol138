package org.example.Collections;

public class TwoDimensionalArrayExample {
    public static void printOut2DArray() {
        String[][] grid = new String[][] {
                new String[] {"O", "X", "O"},
                new String[] {"X", "X", "X"},
                new String[] {"O", "O", "X"},
        };

        for (Integer i = 0; i < grid.length; i++) {
            for (Integer j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
