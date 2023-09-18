package leetCode;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total prime numbers: " + count);
    }

    // This function takes an integer n as input and returns a boolean indicating whether n is a prime number or not.
    //  This method checks for divisibility of n by all numbers from 2 to the square root of n.
    // If n is divisible by any number from 2 to the square root of n, it is not a prime number.
    // if n is divisible by any number greater than the square root of n, it is divisible by a smaller number.
    public static boolean isPrime(int n) {
        // Start a loop from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Check if n is divisible by i
            if (n % i == 0) {
                // If n is divisible by i, it is not a prime number, so return false
                return false;
            }
        }
        // If the loop completes without finding a factor of n, n is a prime number, so return true
        return true;
    }

}

/*We run the loop from 2 to the square root of n because we know that all factors of a number n are less than or equal to its square root.

For example, let's consider the number 16. The factors of 16 are 1, 2, 4, 8, and 16. If we start from 2 and check all the way up to 16,
we'll find all the factors. However, we can make this process more efficient by stopping at the square root of 16, which is 4. If we
haven't found any factors up to 4, we know that there cannot be any more factors greater than 4 because they would have to be paired
with a factor less than 4, and we've already checked all of those.

In general, if n has a factor greater than its square root, then it must also have a factor smaller than its square root. Therefore,
we only need to check for factors up to the square root of n.

For example, let's say we want to check if 29 is a prime number. We only need to check if it is divisible by 2, 3, 4, 5, or
the square root of 29 (which is about 5.385). Since 29 is not divisible by any of these numbers, it is a prime number.

By only checking up to the square root of n, we can significantly reduce the number of iterations in the loop,
which makes the algorithm more efficient*/
