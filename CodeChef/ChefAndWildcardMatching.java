package CodeChef;

import java.util.Scanner;

/*
Chef wants to implement wildcard pattern matching supporting only the wildcard '?'.
The wildcard character '?' can be substituted by any single lower case English letter for matching.
He has two strings X and Y of equal length, made up of lower case letters and the character '?'.
He wants to know whether the strings X and Y can be matched or not.
*/

public class ChefAndWildcardMatching {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //T is the no. of test cases.
        int T=scan.nextInt();
        while(T-- >0){
            //String one.
            String X = scan.next();
            //String two
            String Y = scan.next();

            //length of the first string. (both the string will be of same length).
            int len=X.length();

            // keeping the count for same chars in both  the strings.
            int count=0;
            for (int i=0;i<len ;i++ )
            {

                //if the char at the same position in both the strings are same or if the char is '?' in both the strings.
                if(X.charAt(i)==Y.charAt(i) ||X.charAt(i)=='?' || Y.charAt(i)=='?')
                {
                    //increment the count.
                    count++;
                }
            }

            //if the count is equal to the length of the string then the strings are same.
            System.out.println(count==len?"Yes":"No");
        }
    }
}

