package CodeChef;

import java.util.Scanner;

public class SpeedLimitTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T= scan.nextInt();

        for (int i = 0; i < T; i++) {
            double A=scan.nextDouble();

            int X=scan.nextInt();

            int B=scan.nextInt();

            int Y=scan.nextInt();

            if ((A / X) > (B / Y)) {
                System.out.print("ALICE");
            } else if ((A / X) < (B / Y)) {
                System.out.print("BOB");
            }
            else System.out.print("EQUAL");
        }
    }
}
