package leetCode;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] A = {1, 2, 5, 8};
        int K = 1968;
        System.out.println(addToArrayForm(A, K));
    }

    private static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            res.add(0, k % 10);
            k /= 10;
        }
        return res;
    }
}
