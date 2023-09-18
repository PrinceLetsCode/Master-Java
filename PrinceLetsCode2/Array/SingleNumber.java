package PrinceLetsCode2.Array;

import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        System.out.println(singleNumber(arr));  
    }


    // using Map
    private static int singleNumber(int[] arr) {
        Map<Integer,Integer> map = new java.util.HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return -1;
    }
}
