package Recursion;

public class ReversingANumber {
    public static void main(String[] args) {
        System.out.println(reverse(123,0));
    }

    private static int reverse(int originalNum, int reversedNum) {
        if (originalNum == 0) {
            return reversedNum;
        }
        int lastDigit = originalNum % 10;
        originalNum=originalNum/10;
        reversedNum=reversedNum*10+lastDigit;
        return reverse(originalNum,reversedNum);
    }
}
