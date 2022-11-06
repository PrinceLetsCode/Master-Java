package Recursion;

public class LinearlyOneToN {
    public static void main(String[] args) {
        printOneToN(80);

        System.out.println();
        printOneToN(100,1);
    }

    // we are using backtracking here as we are not incrementing the value of n,instead we are decrementing it without printing
    // it and then printing it when we backtrack.
    private static void printOneToN(int n) {
        if(n==0){
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
    }

    private static void printOneToN(int n,int i) {
        if(i>n){
            return;
        }
        System.out.println(i);
        printOneToN(n,i+1);
    }
}
