package PrinceLetsCode2.Array;

public class FindPoisonedDuration {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,10,11};
        System.out.println(findPoisonedDuration(arr, 3));
    }

    private static int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalDuration = 0;
        int n = timeSeries.length;

        for(int i =0; i< n-1; i++) {
            int durationEndOne = timeSeries[i] + duration-1;
            int durationEndTwo = timeSeries[i+1] + duration-1;

            int diff = durationEndTwo - durationEndOne;

            if(diff >= 0 && diff < duration) {
                totalDuration += diff;
            } else {
                totalDuration += duration;
            }
        }

        totalDuration += duration;
        return totalDuration;
    }

    private static int findPoisonedDuration_opt(int[] timeSeries, int duration) {
        int timeDuration = 0;
        for(int i =0; i< timeSeries.length-1; i++) {
            timeDuration += Math.min(timeSeries[i+1] - timeSeries[i], duration);
        }

        return timeDuration + duration; 
    }
}
