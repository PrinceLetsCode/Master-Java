package PrinceLetsCode2.Array;

public class EvenOddChecker {
    public static void main(String[] args) {
        int num  = 11;
        isEvenOdd(num);
    }

    private static void isEvenOdd(int num) {
        String binary  = Integer.toBinaryString(num);
        System.out.println(binary);

        if(binary.charAt(binary.length()-1) == '0'){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
