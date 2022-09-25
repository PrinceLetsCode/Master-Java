package CodeChef;

import java.util.Scanner;

public class Turn_it {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();

        if(T<=0 || T>100000)
        {
            return;
        }

        while(T-- >0)
        {
            int U=scan.nextInt();
            int V=scan.nextInt();
            int A=scan.nextInt();
            int S=scan.nextInt();

            if(U<=0 || U>10000)
            {
                return;
            }

            if(V<=0 || V>10000)
            {
                return;
            }

            if(A<=0 || A>10000){
                return;
            }
            if(S<=0 && S>10000)
            {
                return;
            }

            if(U==V)
            {
                System.out.println("Yes");
            }
            else if(Math.sqrt((U*U)-(2*A*S))<=V)
            {
                System.out.println("Yes");
            }
	            else {
                System.out.println("No");
            }

        }
    }
}
