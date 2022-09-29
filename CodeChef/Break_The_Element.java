package CodeChef;

import java.util.Scanner;

public class Break_The_Element {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        //T is number of test cases.
        int T=scan.nextInt();

        while(T-- >0)
        {
            //N is the size of the array.
            int N=scan.nextInt();
            int []arr=new int[N];

            //taking inputs to the array.
            for (int i=0;i<N ;i++ )
            {
                arr[i]=scan.nextInt();
            }

            //count variable to count how many times we need to split an element to make the parity same.
            int count=0;

            //traversing the array.
            for(int i=0;i<N;i++)
            {
                //checking if current element is zero then we do not need to split and so no need to increase the count.
                //hence we continue the loop without further execution.
                if(arr[i]==0) continue;

                // storing the current element in an integer so that we can perform operations on it without altering the
                //original elements of the array.
                int n = arr[i];

                //if the number is an even number, then we divide it until it becomes odd.so that the parity can be same.
                while (n % 2 == 0) {
                    //increasing the counter for every operation.
                    count++;
                    n=n/2;
                }
            }

            //printing the number of operations it took to make the parity of every element in an array same.
            System.out.println(count);
        }



    }
}
