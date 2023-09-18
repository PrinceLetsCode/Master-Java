package leetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KClosestPointToOrigin {
    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        int [][] res = kClosest(points, k);
        for (int[] re : res) {
            System.out.println(re[0] + " " + re[1]);
        }
    }


    private static int[][] kClosest(int[][] points, int k) {

        int[][] res = new int[k][2];
        List<int[]> list = new ArrayList<>();

        for (int[] point : points) {
            list.add(point);
        }

        list.sort(Comparator.comparingInt(a -> (a[0] * a[0] + a[1] * a[1])));

        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
