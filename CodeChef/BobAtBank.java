package CodeChef;

import java.util.Scanner;

public class BobAtBank {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int T=scan.nextInt();

        for (int i=0;i<T ;i++ )
        {
            int W=scan.nextInt();  //initial amount

            int X=scan.nextInt();  //amount deposited

            int Y=scan.nextInt();  //amound deducted

            int z=scan.nextInt(); //no of months

            for (int j = 0; j < z; j++) {
                W=W+X-Y;
            }
            System.out.print(W);

        }
    }
}
