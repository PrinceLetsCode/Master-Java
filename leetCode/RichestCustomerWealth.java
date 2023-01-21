package leetCode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealthSum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealthSum += accounts[i][j];
            }
            if (wealthSum > maxWealth) {
                maxWealth=wealthSum;
            }
        }
        return maxWealth;
    }
}
