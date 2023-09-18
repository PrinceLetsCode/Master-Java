package leetCode;

public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(ops));
    }

    private static int calPoints(String[] operations) {

        int[] res = new int[operations.length];
        int index = 0;
        for (String op : operations) {
            switch (op) {
                case "C":
                    index--;
                    break;
                case "D":
                    res[index] = res[index - 1] * 2;
                    index++;
                    break;
                case "+":
                    res[index] = res[index - 1] + res[index - 2];
                    index++;
                    break;
                default:
                    res[index] = Integer.parseInt(op);
                    index++;
            }
        }
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += res[i];
        }

        return sum;
    }
}
