package CodeChef;

import java.util.Scanner;

public class Chef_and_stock_price {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();

        while(T-- >0)
        {
            double S=scan.nextInt();
            double A=scan.nextInt();
            double B=scan.nextInt();
            double C=scan.nextInt();

            double increased_amt=(S+(S*(C/100)));


            if(increased_amt>=A && increased_amt<=B)
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }

}
