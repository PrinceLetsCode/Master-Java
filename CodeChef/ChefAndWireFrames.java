package CodeChef;

import java.util.Scanner;

public class ChefAndWireFrames {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int T = scan.nextInt();
            int N = scan.nextInt();
            int M = scan.nextInt();
            int X = scan.nextInt();

            System.out.print(X * (2 * (N + M)));
        }
    }
}