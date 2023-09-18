package PrinceLetsCode2.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g, s));
    }

    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while(i < g.length && j < s.length) {
            if(g[i] <= s[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i;
    }
}
