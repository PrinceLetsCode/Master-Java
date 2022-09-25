package CodeChef;

import java.util.Scanner;

public class Vaccine_dates {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int T=scan.nextInt();

        while(T-- >0)
        {
            System.out.println("Enter the Date of vaccine to be taken: ");
            int D=scan.nextInt();
            System.out.println("Enter the starting date: ");
            int L=scan.nextInt();
            System.out.println("Enter the last date: ");
            int R=scan.nextInt();

            if(D<L)
            {
                System.out.println("Too Early");
            }
            else if(D>R)
            {
                System.out.println("Too Late");
            }
            else{
                System.out.println("Take second dose now");
            }

        }
    }
}
