package PrinceLetsCode2.Array;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(maxProfit(arr));
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

      for(int i = 0;  i < prices.length ; i++){
          if(prices[i] < minPrice){
              minPrice = prices[i];
            }
          else {
              while (i < prices.length - 1 && prices[i] < prices[i + 1]) {
                  i++;
              }

                maxProfit += prices[i] - minPrice;
              if (i < prices.length - 1) {
                  minPrice = prices[i + 1];
              }

          }

    }
        return maxProfit;
    }
}
