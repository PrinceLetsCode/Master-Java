package CodeChef;

import java.util.Scanner;

public class Tom_and_jerry {

    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     int T=scan.nextInt();
        while (T-- > 0) {

            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=scan.nextInt();
            int d=scan.nextInt();
            int K=scan.nextInt();

            int disp=Math.abs(a-c)+Math.abs(b-d);

            if (disp == K || K > disp && (K-disp) % 2 == 0) {
                System.out.println("yes");
            }
            else System.out.println("No");

        }
    }
}
