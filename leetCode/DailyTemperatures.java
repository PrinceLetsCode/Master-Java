package leetCode;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = dailyTemperatures(temperatures);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }


//    this solution exceeds time limit.
    private static int[] dailyTemperatures(int[] temperatures){
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int j = i + 1;
            while (j < temperatures.length) {
                if (temperatures[j] > temperatures[i]) {
                    res[i] = j - i;
                    break;
                }
                j++;
            }
        }
        return res;
    }


   // using stack

    private static int[] dailyTemperatures_2(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                res[index] = i - index;
            }
            stack.push(i);
        }
        return res;
    }

    

}
