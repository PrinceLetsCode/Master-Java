package leetCode;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(45268));
    }

    private static int addDigits(int num) {
        int sum = 0;

        while(num > 9) {

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
            sum = 0;
        }
        return num;
    }
}
