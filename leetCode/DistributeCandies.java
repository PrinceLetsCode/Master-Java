package leetCode;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candies = {1,1,2,2,3,4,5,6};
        System.out.println(distributeCandies(candies));
    }

    private static int distributeCandies(int[] candyType){
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }
        return Math.min(set.size(), candyType.length/2);
    }
    
}
