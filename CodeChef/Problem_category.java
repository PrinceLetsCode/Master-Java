package CodeChef;

import java.util.Scanner;

public class Problem_category {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();

        if(T<=0 || T>50)
        {
            return;
        }

        while(T-- >0){
            int x=scan.nextInt();

            if(x<=0 || x>300)
            {
                return;
            }

            if(x>=1 && x<100){
                System.out.println("Easy");
            }
            else if(x>=100 && x<200)
            {
                System.out.println("Medium");
            }
            else System.out.println("Hard");
        }
    }
}
