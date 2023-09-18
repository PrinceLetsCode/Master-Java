package Bit_manipulation;

import javax.naming.NamingEnumeration;
import java.time.Period;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(islandPerimeter_2(grid));
    }

    private static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    if (i - 1 < 0 || grid[i - 1][j] == 0) {
                        perimeter++;
                    }

                    if (i + 1 == row || grid[i + 1][j] == 0) {
                        perimeter++;
                    }

                    if (j - 1 < 0 || grid[i][j - 1] == 0) {
                        perimeter++;
                    }

                    if (j + 1 == col || grid[i][j + 1]==0) {
                        perimeter++;
                    }
                }
            }
        }

        return perimeter;
    }

    // optimized code



//    the description of this problem implies there may be an "pattern" in calculating the perimeter of the islands.
//    and the pattern is islands * 4 - neighbours * 2, since every adjacent islands made two sides disappeared(as picture below).


    /*
+--+     +--+                   +--+--+
|  |  +  |  |          ->       |     |
+--+     +--+                   +--+--+
4 + 4 - ? = 6  -> ? = 2

     */
    private static int islandPerimeter_2(int[][] grid) {
        int islands = 0;
        int neighbours =0;

        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    islands++;

                    if (i < row - 1 && grid[i + 1][j] == 1) {
                        neighbours++;
                    }

                    if (j < col - 1 && grid[i][j + 1] == 1) {
                        neighbours++;
                    }
                }
            }
        }

        return 4*islands - 2*neighbours;
    }
}
