package PrinceLetsCode2.Array;

import java.util.List;
import java.util.ArrayList;
public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }

    private static List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
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

        return result;
    }
}
