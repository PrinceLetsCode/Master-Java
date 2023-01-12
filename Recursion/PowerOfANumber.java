package Recursion;

public class PowerOfANumber {
    public static void main(String[] args) {
        System.out.println(calculate_power(4,2,1));
    }

    private static int calculate_power(int number, int power,int result) {
        if (power == 0) {
            return result;
        }
        result*=number;
        return calculate_power(number,power-1,result);
    }


}
