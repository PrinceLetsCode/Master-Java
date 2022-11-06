package Recursion;

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println(factorialOfN_Iteration(5));
        System.out.println(factorialOfN_Recursion_functional(5));
        int fact=1;
        System.out.println(factorialOfN_Recursion_parameterized(5,fact));
    }

    private static int factorialOfN_Iteration(int n) {
        int fact = 1;
        for (int j = 1; j <= n; j++) {
            fact *= j;
        }
        return fact;
    }

    private static int factorialOfN_Recursion_functional(int n){
        if(n==0){
            return 1;
        }
        return n * factorialOfN_Recursion_functional(n-1);
    }

    private static int factorialOfN_Recursion_parameterized(int n, int fact) {
        if(n<=0){
            return fact;
        }
        return factorialOfN_Recursion_parameterized(n-1,fact*n);
    }
}
