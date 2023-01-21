package leetCode;

import java.util.ArrayList;

public class StringSwap {
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "ac";
        System.out.println(areAlmostEqual(s1, s2));
    }

    private static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length() != s2.length()) return false;
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        boolean toReturn = false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) list.add(i);
        }
        if(list.size() > 2) return false;
        if(list.size() == 2)
        {
            int i = list.get(0) , j = list.get(1);
            toReturn = s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
            return toReturn;
        }

        return toReturn;
    }

}
