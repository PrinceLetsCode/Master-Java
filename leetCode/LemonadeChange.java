package leetCode;

public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
        System.out.println(lemonadeChange(bills));
    }

    private static boolean lemonadeChange(int[] bills) {
            if (bills[0] > 5) {
                return false;
            }

            int fiveBills = 0;
            int tenBills = 0;

            for(int i = 0; i < bills.length; i++){
                if(bills[i]== 5){
                    fiveBills++;
                }
                else if (bills[i] == 10){
                    if(fiveBills<1){
                        return false;
                    }
                    else {

                        fiveBills--;
                        tenBills++;
                    }
                }
                else{
                    if (tenBills > 0 && fiveBills > 0) {
                        tenBills--;
                        fiveBills--;
                    } else if (fiveBills >= 3) {
                        fiveBills -= 3;
                    } else {
                        return false;
                    }
                }
            }

            return true;
    }
}
