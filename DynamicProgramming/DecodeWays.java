package DynamicProgramming;

public class DecodeWays {
    public static void main(String[] args) {
        String s = "10261056";
        System.out.println(numDecodings(s));
        System.out.println(numDecodings_dp(s, 0, new int[s.length()]));
        System.out.println(numDecodings_tabulation(s));
    }

    private static int numDecodings(String s) {
        // base case -> if string is empty or string starts with 0, return 0
        if (s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        return numDecodings(s, 0);
    }

    private static int numDecodings(String s, int ind) {
        //  base case -> if ind is equal to length of string, return 1
        if (ind == s.length()) {
            return 1;
        }

//        base case -> if string starts with 0, return 0
        if (s.charAt(ind) == '0') {
            return 0;
        }

//        base case -> if ind is equal to length of string - 1, return 1
        if (ind == s.length() - 1) {
            return 1;
        }

//        recursive case -> if string is not empty, return the sum of recursive calls
        int count = numDecodings(s, ind + 1);

//        if the substring of string from ind to ind + 2 is less than or equal to 26, add the recursive call to count
        if (Integer.parseInt(s.substring(ind, ind + 2)) <= 26) {
            count += numDecodings(s, ind + 2);
        }

        return count;
    }

//    approach 2: Dynamic Programming solution -> Top-Down Approach -> Memoization
//    time complexity: O(n)
//    space complexity: O(n)


    private static int numDecodings_dp(String s, int ind, int[] dp) {
        if (ind == s.length()) {
            return 1;
        }

        if (s.charAt(ind) == '0') {
            return 0;
        }
        if (ind == s.length() - 1) {
            return 1;
        }

        if (dp[ind] != 0) {
            return dp[ind];
        }

        int count = numDecodings_dp(s, ind + 1, dp);
        if (Integer.parseInt(s.substring(ind, ind + 2)) <= 26) {
            count += numDecodings_dp(s, ind + 2, dp);
        }

        dp[ind] = count;
        return count;
    }

//    approach 3: Dynamic Programming solution -> Bottom-Up Approach -> Tabulation
//    time complexity: O(n)
//    space complexity: O(n)

    private static int numDecodings_tabulation(String s) {

        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;
        dp[s.length() - 1] = s.charAt(s.length() - 1) == '0' ? 0 : 1;

        for (int i = s.length() - 2; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                continue;
            }
            if (Integer.parseInt(s.substring(i, i + 2)) <= 26) {
                dp[i] = dp[i + 1] + dp[i + 2];
            } else {
                dp[i] = dp[i + 1];
            }
        }
        return dp[0];
    }

}
