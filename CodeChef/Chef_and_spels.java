package CodeChef;

import java.util.Scanner;

public class Chef_and_spels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();

        if(T<=0 || T>10000)
        {
            return;
        }

        while(T-- >0)
        {
            int A=scan.nextInt();
            int B=scan.nextInt();
            int C=scan.nextInt();

            System.out.println((A+B+C)-Math.min(A,(Math.min(B,C))));
        }
    }
}
