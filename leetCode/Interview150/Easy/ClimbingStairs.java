package leetCode.Interview150.Easy;


//This was simply a fibonacci series.

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    private static int climbStairs(int n) {
        int steps=0;
        int n1=0;
        int n2=1;
        for(int i=1; i<=n;i++){
            steps=n1+n2;
            n1=n2;
            n2=steps;
        }
        return steps;
    }
}
