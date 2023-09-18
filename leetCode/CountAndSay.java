package leetCode;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }

    private static String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
//            s = countAndSay(s);
            s = build(s);
        }
        return s;
    }

    // using compression algorithm
    // Time complexity: O(n^2)
    private static String countAndSay(String s) {
        char[] charArr = s.toCharArray();
        char currChar = ' ';
        int count = 0;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < charArr.length) {
            if (currChar == charArr[i]) {
                count++;
                i++;
            } else {
                if (count > 0) {
                    sb.append(count);
                    sb.append(currChar);
                }
                currChar = charArr[i];
                count = 1;
                i++;
            }
        }
        if (count > 0) {
            sb.append(count);
            sb.append(currChar);
        }
        return sb.toString();
    }

//    time complexity: O(n^2)
    private static String build(String result) {
        StringBuilder builder = new StringBuilder();
        int p = 0;
        while(p < result.length()) {
            char val = result.charAt(p);
            int count = 0;

            while(p < result.length() &&
                    result.charAt(p) == val){
                p ++;
                count ++;
            }
            builder.append(String.valueOf(count));
            builder.append(val);
        }
        return builder.toString();
    }
}
