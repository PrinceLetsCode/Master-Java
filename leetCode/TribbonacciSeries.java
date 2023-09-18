package leetCode;

public class TribbonacciSeries {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tribonacci(n));
    }
    public static int tribonacci(int n) {
        int T1 = 0;
        int T2 = 1;
        int T3 = 1;
        int Tn = 0;
        if (n == 0) {
            return T1;
        }
        if (n == 1) {
            return T2;
        }
        if (n == 2) {
            return T3;
        }
        for (int i = 3; i <= n; i++) {
            Tn = T1 + T2 + T3;
            T1 = T2;
            T2 = T3;
            T3 = Tn;
        }
        return Tn;
    }
}
