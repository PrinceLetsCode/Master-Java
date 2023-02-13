package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwo {
    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow2(rowIndex));
    }

    private static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascalTriangle.add(firstRow);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j));
            }
            currentRow.add(1);
            pascalTriangle.add(currentRow);
        }
        return pascalTriangle.get(rowIndex);
    }

    private static List<Integer> getRow2(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            result.add(0, 1);
            for (int j = 1; j < result.size() - 1; j++) {
                result.set(j, result.get(j) + result.get(j + 1));
            }
        }
        return result;
    }

    /*

Iteration i 	j	result (before)	    result (after)
          0 		[]	                    [1]
          1 		[1]	                    [1, 1]
          2 	0	[1, 1]	                [1, 2, 1]
          3 	0	[1, 2, 1]	            [1, 3, 3, 1]
          3 	1	[1, 3, 3, 1]	        [1, 3, 3, 1]
          4 	0	[1, 3, 3, 1]	        [1, 4, 6, 4, 1]
          4 	1	[1, 4, 6, 4, 1]	        [1, 4, 6, 4, 1]
          4 	2	[1, 4, 6, 4, 1]	        [1, 4, 6, 4, 1]
          5 	0	[1, 4, 6, 4, 1]	        [1, 5, 10, 10, 5, 1]
          5 	1	[1, 5, 10, 10, 5, 1]	[1, 5, 10, 10, 5, 1]
          5 	2	[1, 5, 10, 10, 5, 1]	[1, 5, 10, 10, 5, 1]
          5	    3	[1, 5, 10, 10, 5, 1]	[1, 5, 10, 10, 5, 1]

     */

}
