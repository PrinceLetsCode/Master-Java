package The450;

public class Factorial {

    public static void find_factorial(int n) {

        int prod=1;
        while (n >= 1) {
            prod*=n;
            n--;
        }

        System.out.println(prod);
    }

    public static void main(String[] args) {
        find_factorial(10);
    }
}
