package leetCode;

public class Problem_28 {

    public static int solve(String haystack, String needle) {
        int result =-1;
        if(haystack.contains(needle)){
            result = haystack.indexOf(needle);
        }
        return result;
    }

    public static void main(String[] args) {

        String haystack = "prince";
        String needle = "";

        System.out.println(solve(haystack, needle));

    }
}
