package leetCode;

public class CountOddInInterval {
    public static void main(String[] args) {
        int low = 3;
        int high = 15;
        int oddNum = findOdd(high, low);
        System.out.println(oddNum);
    }

    private static int findOdd(int high, int low) {
        if (high % 2 != 0 || low % 2 != 0) {
            return ((high-low)/2)+1;
        }
        return (high-low)/2;
    }
}
