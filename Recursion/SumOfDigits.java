package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits_Iteration(123));
        System.out.println(sumOfDigits_Recursion_functional(123));
        System.out.println(sumOfDigits_Recursion_parameterized(123,0));
    }

    private static int sumOfDigits_Iteration(int i) {
        int sum=0;
        while(i>0){
            int rem=i%10;
            i=i/10;
            sum+=rem;
        }
        return sum;
    }

    private static int sumOfDigits_Recursion_functional(int i) {
        if(i==0){
            return 0;
        }
        return i%10+sumOfDigits_Recursion_functional(i/10);
    }

    private static int sumOfDigits_Recursion_parameterized(int i, int sum) {
        if(i==0){
            return sum;
        }
        return sumOfDigits_Recursion_parameterized(i/10,sum+i%10);
    }
}
