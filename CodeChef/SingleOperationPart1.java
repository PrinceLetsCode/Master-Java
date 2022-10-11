package CodeChef;

import java.util.Scanner;

public class SingleOperationPart1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();

        while(T-- >0)
        {
            int len=scan.nextInt();
            String S=scan.next();

            int res=len;
            for (int i=1;i<len;i++ ) {
                if(S.charAt(i)=='0')
                {
                    res=i;
                    break;
                }
            }

            System.out.println(res);
        }
    }

}
