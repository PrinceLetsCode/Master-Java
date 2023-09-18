package PrinceLetsCode2.Array;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr = {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        int h = 823855818;
        System.out.println(minEatingSpeed(arr, h));
    }


    // brute force. Time complexity: O(n^2)
    private static int minEatingSpeed(int[] piles, int h) {

        int maxPile = piles[0];
        for(int pile : piles){
            maxPile = Math.max(maxPile, pile);
        }

        for(int speed = 1; speed <= maxPile; speed++){
            if(canEatAll(piles, speed, h)){
                return speed;
            }
        }

        return maxPile;

    }

    private static boolean canEatAll(int[] piles, int mid, int h) {
        int count = 0;
        for(int pile : piles){
            count += Math.ceil((double)pile / mid);
        }
        return count <= h;
    }

    // optimized solution. Time complexity: O(nlogn)

    private static int minEatingSpeed_optimized(int[] piles, int h){
        Arrays.sort(piles);
        int n = piles.length;
        int low = 1;
        int high = piles[n-1];
        while(low < high){
            int mid = low + (high - low) / 2;
            if(canEatAll(piles, mid, h)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
