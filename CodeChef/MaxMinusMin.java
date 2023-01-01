package CodeChef;

import java.util.Scanner;

public class MaxMinusMin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();

        while(T-- > 0)
        {
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=scan.nextInt();

            int max=Math.max(a,Math.max(b,c));
            int min=Math.min(a,Math.min(b,c));

            System.out.println(max-min);
        }
    }
}
