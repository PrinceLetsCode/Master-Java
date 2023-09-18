package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {2,5,10,1};
        int amount = 27;

        int dp[][] = new int[coins.length][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(coinChange(coins, amount, coins.length - 1));
    }

    private static int coinChange(int[] coins, int amount,int ind) {
        if (amount == 0) {
            return 0;
        }
        if (ind == -1 || amount < 0) {
            return -1;
        }
        int notPick = coinChange(coins, amount, ind - 1);
        int pick = Integer.MAX_VALUE;
        if (coins[ind] <= amount) {
            pick = 1 + coinChange(coins, amount - coins[ind], ind);
        }
        if (notPick == -1) {
            return pick;
        }
        if (pick == Integer.MAX_VALUE) {
            return notPick;
        }
        return Math.min(pick, notPick);
    }

    // dynamic programming -> top down approach -> memoization
    private static int coinChange(int[] coins, int amount, int ind, int[][] dp) {
        if (ind == 0) {
            if (amount % coins[ind] == 0) {
                return amount / coins[ind];
            } else {
                return -1;
            }
        }
        if (dp[ind][amount] != -1) {
            return dp[ind][amount];
        }
        int notPick = coinChange(coins, amount, ind - 1, dp);
        int pick = Integer.MAX_VALUE;
        if (coins[ind] <= amount) {
            pick = 1 + coinChange(coins, amount - coins[ind], ind, dp);
        }
        dp[ind][amount] = Math.min(pick, notPick);
        return dp[ind][amount];
    }
}
