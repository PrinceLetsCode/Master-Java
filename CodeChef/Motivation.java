package CodeChef;

import java.util.Scanner;

public class Motivation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-- >0){
            int N=sc.nextInt();   //N-> number of movies;
            int X=sc.nextInt();   //X-> space in hard-disk;
            int max=0;            // for storing maximum rating;
            for(int j=0;j<N;j++){
                int S = sc.nextInt();   //S->space of the movie;
                int R = sc.nextInt();   //R->rating of the movie;
                if(S<=X && R>=max)    //if space is less than hard-disk storage and rating is greater than max;
                    max =R;
            }
            System.out.println(max);
        }

    }
}
