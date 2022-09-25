package CodeChef;

import java.util.Scanner;

public class Two_dishes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T=scan.nextInt();
        while (T-- > 0) {
            int N=scan.nextInt();
            int A=scan.nextInt();
            int B=scan.nextInt();
            int C=scan.nextInt();

            if (A + C >= N && B >= N) {
                System.out.println("YES");
            } else System.out.println("NO");



        }

    }

}
