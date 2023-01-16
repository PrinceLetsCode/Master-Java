package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfAString {
    public static void main(String[] args) {
        String str = "abc";
        List<List<String>> result=printPermutations(str);
        System.out.println(result);
    }

    private static List<List<String>> printPermutations(String str) {
        List<List<String>> result=new ArrayList<>();
        List<String> list=new ArrayList<>();
        list.add(str.charAt(0)+"");
        result.add(list);
        for (int i = 1; i < str.length(); i++) {
            List<List<String>> temp=new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                for (List<String> list1 : result) {
                    List<String> list2=new ArrayList<>(list1);
                    list2.add(j,str.charAt(i)+"");
                    temp.add(list2);
                }
            }
            result=temp;
        }
        return result;
    }
}
