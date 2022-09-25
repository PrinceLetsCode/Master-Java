package CodeChef;

import java.util.Scanner;

public class Hoop_Jump {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no of test cases:");
        int T=scan.nextInt();

        while(T-- >0)
        {
            int N=scan.nextInt();
            if(N==1)
            {
                System.out.println(1);
            }
            else if(N==3)
            {
                System.out.println(3);
            }

            else {
                System.out.println((N/2)+1);
            }
        }
    }

}
