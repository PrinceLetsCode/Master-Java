import java.util.HashMap;
import java.util.Map;

public class PalindromeRearrange {
    public static void main(String[] args) {
        String A = "uucgncntt   ";
        System.out.println(solve_hashing(A));
    }

//    time complexity : O(n)
    public static int solve(String A) {
        int [] freq = new int[26];
        int i = 0;
        while (i < A.length()) {
            if (A.charAt(i) != ' ') {
                freq[A.charAt(i) - 'a']++;
            }
            i++;
        }

        int oddCount = 0;

        for (int j = 0; j < freq.length; j++) {
            if (freq[j] % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount > 1) {
            return 0;
        }
        return 1;
    }

//    hashing solution
// time complexity: O(n)
    public static int solve_hashing(String A)
    {
        Map<Character,Integer> map = new HashMap<>();

        int i = 0;
        while (i<A.length()){
            if(A.charAt(i)!=' '){
                map.put(A.charAt(i), map.getOrDefault(A.charAt(i),0)+1);
            }
            else {
                map.put(A.charAt(i),map.getOrDefault(A.charAt(i),0));
            }
            i++;
        }

        int oddCount = 0;
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2!=0){
                oddCount++;
            }
        }
        if(oddCount>1){
            return 0;
        }
        return 1;
    }
}
