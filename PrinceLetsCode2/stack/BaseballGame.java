package PrinceLetsCode2.stack;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};

        System.out.println(calPoints(ops));
    }

    private static int calPoints(String[] operations) {
        int sum = 0;
        int[] arr = new int[operations.length];

        int j = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                arr[j - 1] = 0;
                j--;
            } else if (operations[i].equals("D")) {
                arr[j] = arr[j - 1] * 2;
                j++;
            } else if (operations[i].equals("+")) {
                arr[j] = arr[j - 1] + arr[j - 2];
                j++;
            } else {
                arr[j] = Integer.parseInt(operations[i]);
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    private static int calPoints_stack(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (String s : operations) {
            if (s.equals("C")) {
                stack.pop();
            } else if (s.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (s.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}
