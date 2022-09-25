package CodeChef;

import java.util.Scanner;

public class Programming_language {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();

        if(T>288)
        {
            return;
        }

        while(T-- >0)
        {
            int A=scan.nextInt();
            int B=scan.nextInt();
            int A1=scan.nextInt();
            int B1=scan.nextInt();
            int A2=scan.nextInt();
            int B2=scan.nextInt();

            if (A==B)
            {
                return;
            }

            if((A==A1 || A==B1) && (B==A1 || B==B1) )
            {
                System.out.println(1);
            }
            else if((A==A2 || A==B2) && (B==A2 || B==B2)){
                System.out.println(2);
            }else System.out.println(0);
        }


    }
}
