package CodeChef;

import java.util.Scanner;

public class GoodPair {


    public static int find_good_pair(int[] arr) {
        int n=arr.length;


        if (n <= 2) {
            return 0;
        }

            int count=0;
            for (int j = 0; j <n; j++) {
                int gcd=0;
                int lcm=0;
                for (int k = j+1; k <n ; k++) {
                    gcd = find_Gcd(arr[j], arr[k]);
                    lcm=((arr[j]*arr[k])/(gcd));

                    if (gcd == lcm) {
                        count++;
                    }
                }

            }

        return count;
    }

    public static int find_Gcd(int n1, int n2) {

        int og_n1=n1;
        int og_n2=n2;

        if (n1 == n2) {
            return n2;
        }

        while(n1!=n2)
        {
            if(n1>n2)
                n1=n1-n2;
            else
                n2=n2-n1;
        }

//        System.out.println("lcm is"+((og_n2*og_n1)/n2));
        return n2;
    }

    public static void main(String[] args) {

        int[] arr = {12,12,18,18};
        System.out.println(find_good_pair(arr));

//        System.out.println(find_Gcd(12, 4));
    }
}
