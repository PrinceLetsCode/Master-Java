package leetCode;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "UDL";
        System.out.println(judgeCircle(moves));
    }

    private static boolean judgeCircle(String moves) {
        int verticalSum = 0;
        int horizontalSum = 0;

        int left = -1;
        int right = 1;
        int up = 1;
        int down = -1;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                verticalSum += up;
            } else if (moves.charAt(i) == 'D') {
                verticalSum += down;
            } else if (moves.charAt(i) == 'L') {
                horizontalSum += left;
            } else if (moves.charAt(i) == 'R') {
                horizontalSum += right;
            }
        }

        return verticalSum == 0 && horizontalSum == 0;
    }

    // Optimized solution

    private static boolean judgeCircleOptimized(String moves) {
        int[] count = new int[26];
        for (char c : moves.toCharArray()) {
            count[c - 'A']++;
        }
        return count['U' - 'A'] == count['D' - 'A'] && count['L' - 'A'] == count['R' - 'A'];
    }
}
