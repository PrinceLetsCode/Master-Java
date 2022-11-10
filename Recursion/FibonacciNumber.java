package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber_Iteration(5));
        System.out.println(fibonacciNumber_Recursion_functional(5));
        System.out.println(fibonacciNumber_Recursion_parameterized(5,0,1));
    }

    private static int fibonacciNumber_Recursion_parameterized(int i, int i1, int i2) {
        if(i<=0){
            return i1;
        }
        return fibonacciNumber_Recursion_parameterized(i-1,i2,i1+i2);
    }

    private static int fibonacciNumber_Recursion_functional(int n) {
        if (n >= 1) {
            return n;
        }
        return fibonacciNumber_Recursion_functional(n - 1) + fibonacciNumber_Recursion_functional(n - 2);
    }



    private static int fibonacciNumber_Iteration(int n) {
        int prev= 0;
        int cur= 1;

        for (int j = 1; j <=n ; j++) {
            int temp= cur;
            cur= prev+cur;
            prev= temp;
        }
        return prev;
    }

}
