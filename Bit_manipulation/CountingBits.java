package Bit_manipulation;

public class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        int[] result = countBits(n);
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }


    private static int[] countBits(int n){
        int [] result = new int[n+1];
        for(int i = 0;i<=n;i++){
            int num = i;
            int counter=0;
            while(num!=0){
                counter++;
                num = num & (num-1);
            }
            result[i] = counter;
        }

        return result;
    }
}
