package DataStructures.Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMap_tut {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        // adding elements in HashMap

        hashMap.put(1, "prince");
        hashMap.put(2, "komal");
        hashMap.put(3, "yash");
        hashMap.put(4, "mummy");
        hashMap.put(5, "papa");
        hashMap.put(5, "Dad");   //updates the value of a key

        System.out.println(hashMap);
        System.out.println(hashMap.size());

        for (Map.Entry<Integer, String> x : hashMap.entrySet()) {
            System.out.println(x.getKey() + " = " + x.getValue());
        }


        if (hashMap.containsKey(9)) {
            System.out.println(hashMap.get(1));
        }
        else
            System.out.println("doesn't contain value for specified key");

        hashMap.remove(1);
        System.out.println(hashMap.size());

        System.out.println(hashMap.containsValue("prince"));

        for (int i :
                hashMap.keySet()) {
            System.out.println(i);
           // System.out.println(i + " : " + hashMap.get(i));
        }


        for (String i : hashMap.values()) {
            System.out.println(i);
        }

        hashMap.clear();
        System.out.println(hashMap);
        System.out.println(hashMap.isEmpty());
    }

}
