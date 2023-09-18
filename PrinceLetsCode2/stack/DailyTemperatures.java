package PrinceLetsCode2.stack;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures2(arr);

        for(int i : result) {
            System.out.print(i + " ");
        }
    }


    // brute force. Time complexity: O(n^2)
    private static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            for(int j = i+1; j < temperatures.length; j++){
                if(temperatures[j] > temperatures[i]){
                    result[i] = j-i;
                    break;
                }
            }
        }

        return result;
    }

    // using stack. Time complexity: O(n)

    private static int[] dailyTemperatures2(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){
           int temperature = temperatures[i];
           while(!stack.isEmpty() && temperature > temperatures[stack.peek()]){
               int index = stack.pop();
               result[index] = i - index;
           }

              stack.push(i);
        }

        return result;
    }


    // reverse order

    private static int[] dailyTemperatures3(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            int high   = temperatures[i];
            for (int j = i-1; j >= 0; j--) {
                int low = temperatures[j];
                if (high > low) {
                    result[i] = i - j;
                }else{
                    break;
                }

            }
        }

        return result;
    }
}
