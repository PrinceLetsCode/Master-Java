package leetCode;

import java.util.Scanner;

public class PalindromeNumber {

    public static void palindromeCheck(int v){
         int rem;
         int rev=0;
         int temp=v;

         while(v>0)
        {
            rem = v % 10;
            rev = (rev * 10) + rem;
            v = v / 10;
        }

        if (rev == temp) {
            System.out.println("Palindrome check passed...");
        }
        else System.out.println("Palindrome check failed...");
    }

    public static void main(String[] args) {

        palindromeCheck(121);


    }
}
