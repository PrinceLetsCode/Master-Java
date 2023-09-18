package PrinceLetsCode2.revision;

public class FibonacciSequence {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(fibonacci_recursive(num));
    }

    private static int fibonacci(int num) {
        int prev = 0;
        int curr = 1;

        if(num == 0){
            return prev;
        }

        if(num == 1){
            return curr;
        }

        for(int i = 2; i <= num; i++){
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }

        return prev;
    }

    // recursive

    private static int fibonacci_recursive(int num){
        if(num == 0){
            return 0;
        }

        if(num == 1){
            return 1;
        }

        return fibonacci_recursive(num-1) + fibonacci_recursive(num-2);
    }
}
