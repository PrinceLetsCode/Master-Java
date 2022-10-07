package The450;

public class BuyAndSellStock {




    //Upgraded version of the code
    public static int maxProfit(int[] prices) {
        // max profit so far
        int max = 0;

        // min price so far
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            // if current price is less than min price, update min price
            if (prices[i] < min) {
                min = prices[i];
            }

            // if current price - min price is greater than max profit, update max profit
            int profit = prices[i] - min;
            if (profit > max) {
                max = profit;
            }
        }

        // return max profit
        return max;
    }




    public static void main(String[] args) {
        int[] arr =  {-7,-1};
        System.out.println(maxProfit(arr));

    }
}
