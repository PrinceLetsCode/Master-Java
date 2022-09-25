package CodeChef;

import java.util.Scanner;

public class Integers_sum_to_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T=scanner.nextInt();


        int N=scanner.nextInt();

        if (N == 1) System.out.println(0);
        else if (N==2) System.out.println(1);
        else if (N==3) System.out.println(2);
        else if (N==4) System.out.println(3);
        else System.out.println(N-1);
    }
}
