package PrinceLetsCode2.stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    public static void main(String[] args) {
        int target = 12;
        int[] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};

        System.out.println(carFleet(target, position, speed));
    }


    // O(nlogn) time complexity

    private static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        int[][] cars = new int[n][2];
        for(int i = 0; i < n; i++){
            cars[i] = new int[]{position[i], speed[i]};
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        int fleet = 0;
        double time = 0;

        for(int i = 0; i < n; i++){
            double currTime = (double)(target - cars[i][0]) / cars[i][1];
            if(currTime > time){
                time = currTime;
                fleet++;
            }
        }

        return fleet;

    }


    // O(n^2) time complexity
    private static int carFleet2(int target, int[] position, int[] speed) {
        int N = position.length, res = 0;
        double[][] cars = new double[N][2];
        for (int i = 0; i < N; ++i)
            cars[i] = new double[] {position[i], (double)(target - position[i]) / speed[i]};
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));
        double cur = 0;
        for (int i = N - 1; i >= 0 ; --i) {
            if (cars[i][1] > cur) {
                cur = cars[i][1];
                res++;
            }
        }
        return res;
    }

    // o(n) time complexity

    private static int carFleet3(int target, int[] position, int[] speed) {
        if (position.length == 1 || position.length == 0) return position.length;

        int fleet = 0;

        double[] timeToTarget = new double[target];

        for(int i = 0 ; i < position.length; i++){
            double time = (double)(target-position[i])/speed[i];
            timeToTarget[position[i]] = time;
        }


        double prevTimeToTarget = 0;

        for(int i = target-1 ; i >=0; i--){
            if(timeToTarget[i] > prevTimeToTarget){
                prevTimeToTarget = timeToTarget[i];
                fleet++;
            }
        }

        return fleet;

    }
}
