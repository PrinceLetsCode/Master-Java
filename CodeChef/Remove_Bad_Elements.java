package CodeChef;

import java.util.*;

public class Remove_Bad_Elements {



    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        int T=scan.nextInt();

        if(T<=0 || T>4000)return;
        while(T-- >0)
        {
            int N=scan.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=scan.nextInt();
            }

            Map< Integer, Integer > map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(arr[i]))
                    map.put(arr[i], map.get(arr[i]) + 1);
                else
                    map.put(arr[i], 1);
            }

            int max = Collections.max(map.values());

            System.out.println(N-max);
        }

    }
}
