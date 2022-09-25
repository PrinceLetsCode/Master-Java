package leetCode;

public class FibonacciSeries {

    public static void main(String[] args) {
        find_series(10);

    }

    private static void find_series(int n) {
        int prev_minus_one=0;
        int prev=1;

        if (n == 1) {
            System.out.println(prev_minus_one);
            return;
        }
        else if (n == 2) {
            System.out.println(prev_minus_one+prev);
            return;
        }else {
            System.out.println(prev_minus_one);
            System.out.println(prev);
            n=n-2;
        int i=0;
        while (i != n) {
            int sum=prev+prev_minus_one;
            prev_minus_one=prev;
            prev=sum;
            System.out.println(sum);
            i++;
        }}



    }
}
