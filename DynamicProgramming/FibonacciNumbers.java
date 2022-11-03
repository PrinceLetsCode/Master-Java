package DynamicProgramming;

import java.util.Scanner;
import java.util.Vector;

public class FibonacciNumbers {



    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();

        // declare a vector to store the fibonacci numbers
        Vector<Integer> dp = new Vector<>(6);

        // initialize the vector with -1 to indicate that the fibonacci number is not calculated yet
        for (int i = 0; i < n + 1; i++) {
            dp.add(-1);
        }

        // calculate the fibonacci number
        System.out.println(fib(n,dp));
        System.out.println(fib_2(n,dp));
        System.out.println(fib_3(n));
    }




    // time complexity: O(n)'
    // space complexity: O(n) because of the recursive stack +O(n) because of the dp array = O(n)
    // top down approach -> recursion + memoization
    private static int fib(int n, Vector<Integer> dp) {
        // base case
        if(n<=1) return n;

        // if the fibonacci number is already calculated, then return it
        if(dp.get(n)!=-1) return dp.get(n);

        // calculate the fibonacci number and store it in the dp array
        dp.add(n,fib(n-1,dp) + fib(n-2,dp));

        // return the fibonacci number
        return dp.get(n);
    }




    // time complexity: O(n)
    // space complexity: O(n)
    // bottom up approach -> tabulation
    private static int fib_2(int n, Vector<Integer> dp) {

        // initialize the dp array
        dp.add(0,0);
        dp.add(1,1);

        // calculate the fibonacci numbers
        for (int i = 2; i <= n; i++) {
            dp.add(i,dp.get(i-1) + dp.get(i-2));
        }

        // return the fibonacci number
        return dp.get(n);
    }


    // time complexity: O(n)
    // space complexity: O(1)
    // bottom up approach -> tabulation
    private static int fib_3(int n) {

        // prev and prev_2 variables to store the previous and current fibonacci numbers
        int prev_2 = 0;
        int prev = 1;

        // calculate the fibonacci numbers
        for (int i = 2; i <= n; i++) {
            // calculate the current fibonacci number
            int curr = prev_2 + prev;
            // update prev_2 and prev
            prev_2 = prev;
            prev = curr;
        }

        // return the fibonacci number
        return prev;
    }

}
