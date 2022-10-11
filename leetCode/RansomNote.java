package leetCode;

import java.util.HashMap;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> map=new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            if(map.containsKey(ransomNote.charAt(i))){
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))+1);
            }else{
                map.put(ransomNote.charAt(i),1);
            }
        }


        for (int i = 0; i < magazine.length(); i++) {
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))-1);
            }
            if (map.get(magazine.charAt(i))==null){
                map.remove(magazine.charAt(i));
            }
        }

        if (map.isEmpty())
            return true;
            else return false;

        }

    public static void main(String[] args) {

            String ransomNote = "aa";
            String magazine = "ab";

            System.out.println(canConstruct(ransomNote, magazine));

    }
}
