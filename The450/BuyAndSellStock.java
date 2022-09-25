package The450;

public class BuyAndSellStock {

    public static void find_profit(int[] arr) {

        int buy=arr[0];
        int sell = arr[0];

        int buy_index=-1;
        int sell_index=-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < buy) {
                buy = arr[i];
                buy_index=i;
            }
        }

        sell_index=buy_index;
        sell=arr[sell_index];

        for (int j = buy_index; j <arr.length ; j++) {
            if (arr[j] > sell) {
                sell = arr[j];
                sell_index=j;
            }
        }

        if (buy_index == sell_index) {
            System.out.println(0);
        } else System.out.println(sell - buy);


    }




    public static void main(String[] args) {
        int[] arr =  {7,1,5,3,6,4};
        find_profit(arr);

    }
}
