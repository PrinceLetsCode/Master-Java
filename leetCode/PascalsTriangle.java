package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generatePascalTriangle(int numRows) {

        // create a list of lists.
        List<List<Integer>> resTriangle = new ArrayList<>();

        // initialize the first row.
        int num=1;

        for (int i = 0; i < numRows; i++) {
            // create a list for each row.
            List<Integer> innerList = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                // if the row is 0 or 1, then add 1 to the list.
                if (i == 0 || j == 0) {
                    num=1;
                    innerList.add(num);
                }
                else {
                    // if the row is greater than 1, then add the sum of the previous row's elements.
                    num=num*(i-j+1)/j;
                    innerList.add(num);
                }
            }

            // add the list to the list of lists.
            resTriangle.add(innerList);
        }
        // return the list of lists.
        return resTriangle;

    }
    public static void main(String[] args) {

        System.out.println(generatePascalTriangle(7));

    }
}
