package PrinceLetsCode2.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(getRowOptimized(n));
    }

    private static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    int left = result.get(i-1).get(j-1);
                    int right = result.get(i-1).get(j);
                    row.add(left + right);
                }
            }
            result.add(row);
        }


        return result.get(rowIndex);
    }


    // optimized solution

    private static List<Integer> getRowOptimized(int rowIndex) {
        List<Integer> result = new ArrayList<>();


        for(int i = 0; i <= rowIndex; i++) {
            result.add(1);
            for(int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j-1) + result.get(j));
            }
        }

        return result;
    }
}
