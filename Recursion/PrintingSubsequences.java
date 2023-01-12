package Recursion;

import java.util.ArrayList;

public class PrintingSubsequences {
    public static void main(String[] args) {
        String str = "abc";
//        printSubsequences(str,"");
        ArrayList<Character> list = new ArrayList<>();
        printSubsequences(list,0,str,str.length());

    }

    private static void printSubsequences(String abc, String s) {
        if(abc.length()==0){
            System.out.println(s);
            return;
        }
        printSubsequences(abc.substring(1),s);
        printSubsequences(abc.substring(1),s+abc.charAt(0));
    }

    private static void printSubsequences(ArrayList<Character> list, int i, String str, int length) {
        if (i >= length) {
            System.out.println(list);
            return;
        }
        list.add(str.charAt(i));
        printSubsequences(list, i + 1, str, length);
        list.remove(list.size() - 1);
        printSubsequences(list, i + 1, str, length);
    }
}
