package PrinceLetsCode2.Array;
import java.util.HashMap;
import java.util.Map;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                count++;
                if(count > arr.length / 2) {
                    return arr[i];
                }
                map.put(arr[i], count);
            } else {
                map.put(arr[i], 1);
            }
        }

        return -1;
    }
}
