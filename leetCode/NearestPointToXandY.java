package leetCode;

public class NearestPointToXandY {
    public static void main(String[] args) {
        int[][] points = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};

        int[] point = new int[]{nearestValidPoint(3, 4, points)};

    }
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int distance = Integer.MAX_VALUE;
        int index=-1;
        for (int i = 0; i < points.length; i++) {
            if (x == points[i][0] || y == points[i][1]) {
                int manh = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (manh < distance) {
                    distance=manh;
                    index = i;
                }
            }
        }
        return index;
    }

    public static int nearestValidPoint_optimized(int x, int y, int[][] points) {
        int result = -1, minSum = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x) {
                int manh = Math.abs(y - points[i][1]);
                if (minSum > manh) {
                    minSum = manh;
                    result = i;
                }
            } else if (points[i][1] == y) {
                int manh = Math.abs(x - points[i][0]);
                if (minSum > manh) {
                    minSum = manh;
                    result = i;
                }
            }
        }
        return result;
    }

}
