package PrinceLetsCode2.revision;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }

        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
