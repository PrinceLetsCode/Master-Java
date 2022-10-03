package CodeChef;

import java.util.Scanner;


/*Chef wants to cross a hallway of NN doors. These NN doors are represented as a string.
Each door is initially either open or close, represented by 11 or 00 respectively.
Chef is required to go through all the doors one by one in the order that they appear,
starting from the leftmost door and moving only rightwards at each step.

To make the journey easier, Chef has a magic wand, using which Chef can flip
the status of all the doors at once. Determine the minimum number of times Chef
has to use this wand to cross the hallway of doors.
 */

public class MagicalDoors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //T is for the test cases.
        int T = scanner.nextInt();

        //while value of T is not equal to 0.
        while (T-- > 0) {

            //taking the input string.
            String S = scanner.next();

            //count for the flipping status.
            int count=0;

            //for determining whether we have to flip the status or not.
            int flag=0;

            for (int i = 0; i < S.length(); i++) {
                // if the character at i pos is zero and flag is 0. then increment the count and turn the flag to 1.
                //if the flag is 1 and next element is 0. it will be considered as 1 and count will not be increased.
                if (S.charAt(i)=='0' && flag==0) {
                    count++;
                    flag=1;
                } else if (S.charAt(i) == '1' && flag == 1)
                //if the character at i pos is 1 and flag is 1. then increment the count and turn the flag to 0.
                //
                {
                    count++;
                    flag=0;
                }
            }

            //print the count.
            System.out.println(count);
        }
    }
}
