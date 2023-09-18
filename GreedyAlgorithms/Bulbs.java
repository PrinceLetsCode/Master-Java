package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Bulbs {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(0);
        A.add(1);
        A.add(0);
        A.add(1);
//        System.out.println(bulbs(A));
        System.out.println(bulbs_optimized(A));
    }

    public static int bulbs(List<Integer> A) {

        int count = 0;
        int i = 0;
        while (i < A.size()) {
            if (A.get(i) == 0) {
                count++;
                for (int j = i; j < A.size(); j++) {
                    if (A.get(j) == 0) {
                        A.set(j, 1);
                    } else {
                        A.set(j, 0);
                    }
                }
            }
            i++;
        }
        return count;
    }

//    optimized solution
    //time complexity: O(n)
    public static int bulbs_optimized(List<Integer> A) {
        int count = 0;
        for (int i = 0; i< A.size();i++){
            if(count%2 == 0){
                A.set(i, A.get(i));
            }
            else{
                if(A.get(i)==0){
                    A.set(i,1);
                }
                else {
                    A.set(i,0);
                }
            }

            if (A.get(i) == 0){
                count++;
            }

        }
        return count;
    }

}
