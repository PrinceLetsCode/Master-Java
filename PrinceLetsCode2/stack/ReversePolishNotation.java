package PrinceLetsCode2.stack;

public class ReversePolishNotation {
    public static void main(String[] args) {

        String[] tokens = {"2", "1", "+", "3", "*"};

        System.out.println(evalRPN(tokens));
    }


    // brute force. Time complexity: O(n)
    private static int evalRPN(String[] tokens) {
        int[] result = new int[tokens.length/2 + 1];
        int index = 0;

        for (String token : tokens){
            switch (token){
                case "+":
                    result[index-2] += result[--index];
                    break;
                case "-":
                    result[index-2] -= result[--index];
                    break;
                case "*":
                    result[index-2] *= result[--index];
                    break;
                case "/":
                    result[index-2] /= result[--index];
                    break;
                default:
                    result[index++] = Integer.parseInt(token);
            }
        }

        return result[0];

    }
}
