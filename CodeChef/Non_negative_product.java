package CodeChef;

import java.util.Scanner;

public class Non_negative_product {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try {

            int T=scan.nextInt();
            if(T<=0 || T>100) return;

            while(T-- >0)
            {
                int N=scan.nextInt();

                if(N<2 || N>10000) return;
                int count=0;
                boolean zero=false;

                for (int i=0;i<N ;i++ )
                {
                    int a=scan.nextInt();
                    if (a==0) {
                        zero=true;
                    }
                    if(a<0) count++;
                }

                if (zero)
                {
                    System.out.println(0);
                }
                else if(count%2==0)
                {
                    System.out.println(0);
                }else System.out.println(1);
            }


        }
        catch(Exception e) {
        }
    }

}
