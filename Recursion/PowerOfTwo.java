package Recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(powerOfTwo(n));
    }

    private static boolean powerOfTwo(int n) {
        if(n<=0) return false;
        if (n>1){
            if (n%2!=0){
                return false;
            }
            return powerOfTwo(n/2);
        }
        return true;
    }
}
