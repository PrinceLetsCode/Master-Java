package DataStructures.Hashing;


/*
* hashset does not allow duplicate elements
* */

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_tut {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("prince");
        hashSet.add("kumar");
        hashSet.add("komal");
        hashSet.add("jain");

        System.out.println(hashSet);

        for (String s:hashSet) {
            System.out.print(s + ", ");
        }


        System.out.println();


        System.out.println(hashSet.contains("prince"));
        System.out.println(hashSet.contains("pratham"));


        System.out.println(hashSet.size());

        hashSet.remove("kumar");
        System.out.println(hashSet);
        System.out.println(hashSet.size());

        Iterator<String> it=hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()+", ");
        }


        System.out.println(hashSet.isEmpty());
        hashSet.clear();

        System.out.println(hashSet);
    }

}
