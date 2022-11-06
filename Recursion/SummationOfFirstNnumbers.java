package Recursion;

public class SummationOfFirstNnumbers {
    public static void main(String[] args) {
        System.out.println(summationOfFirstNnumbers_Iteration(5));
        System.out.println(summationOfFirstNnumbers_Recursion_functional(5));
        int sum=0;
        System.out.println(summationOfFirstNnumbers_Recursion_parameterized(5,sum));
    }

    private static int summationOfFirstNnumbers_Iteration(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += j;
        }
        return sum;
    }

    private static int summationOfFirstNnumbers_Recursion_functional(int n){
        if(n==0){
            return 0;
        }
        return n + summationOfFirstNnumbers_Recursion_functional(n-1);
    }

    private static int summationOfFirstNnumbers_Recursion_parameterized(int n, int sum) {
        if(n<=0){
            return sum;
        }
        return summationOfFirstNnumbers_Recursion_parameterized(n-1,sum+n);
    }
}
