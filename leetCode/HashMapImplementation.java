package leetCode;

import java.util.ArrayList;
import java.util.List;

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMapImplementation hashMap = new HashMapImplementation();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1));            // returns 1
        System.out.println(hashMap.get(3));            // returns -1 (not found)
        hashMap.put(2, 1);          // update the existing value
        System.out.println(hashMap.get(2));            // returns 1
        hashMap.remove(2);          // remove the mapping for 2
        System.out.println(hashMap.get(2));            // returns -1 (not found)
    }

    List<int[]> hashMap;

    private void remove(int i) {
        for (int[] pair : hashMap) {
            if (pair[0] == i) {
                hashMap.remove(pair);
                break;
            }
        }
    }

    private int get(int key) {
        for (int[] pair : hashMap) {
            if (pair[0] == key) {
                return pair[1];
            }
        }
        return -1;
    }

    private void put(int key, int value) {
        for (int[] pair : hashMap) {
            if (pair[0] == key) {
                pair[1] = value;
                return;
            }
        }
        hashMap.add(new int[]{key, value});
    }

    private HashMapImplementation() {
        hashMap = new ArrayList<>();
    }
}
