package CodeChef;

import java.util.Scanner;

public class Weight_balance {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();

        while(T-- >0)
        {
            int w1=scan.nextInt();
            int w2=scan.nextInt();
            int x1=scan.nextInt();
            int x2=scan.nextInt();
            int M=scan.nextInt();


            if(M<=0 || M>10) return;
            if(x1<0 || x1>10) return;
            if(x2<0 || x2>10) return;

            int min_limit=x1*M;
            int max_limit=x2*M;
            int weight_gain=w2-w1;


            if((weight_gain<=max_limit)&&(weight_gain>=min_limit)){
            System.out.println(1);
        }

		    else System.out.println(0);


        }
    }
}
