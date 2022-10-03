package CodeChef;

import java.util.Scanner;

public class ChefAndFeedBack {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        while (T-- > 0) {
            String str = scan.next();
            if (str.contains("010") || str.contains("101")) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }
}
