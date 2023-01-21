package leetCode;

public class StraightLIne {
    public static void main(String[] args) {
        int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        System.out.println(checkStraightLine(points));
    }

    private static boolean checkStraightLine(int[][] points) {
        int x0 = points[0][0];
        int y0 = points[0][1];
        int x1 = points[1][0];
        int y1 = points[1][1];
        int dx = x1 - x0;
        int dy = y1 - y0;
        for (int i = 2; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            if (dx * (y - y1) != dy * (x - x1)) {
                return false;
            }
        }
        return true;
    }
}
