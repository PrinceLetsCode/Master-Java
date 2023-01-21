package leetCode;

public class SumOfAllOddLengthSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr));
    }


    // Brute Force Approach
    // time complexity O(n^3)
    public static int sumOddLengthSubarrays(int[] arr) {
        // initialize the sum to 0 and the length of the array to n
        int n = arr.length, answer = 0;

        // loop through the array
        for (int left = 0; left < n; ++left) {
            // loop through the array again starting from the left index and ending at the end of the array
            for (int right = left; right < n; ++right) {
                // if the length of the subarray is odd, add the sum of the subarray to the answer
                if ((right - left + 1) % 2 == 1) {
                    int currentSum = 0;
                    // loop through the subarray and add the elements to the answer
                    for (int index = left; index < right + 1; ++index) {
                        currentSum += arr[index];
                    }
                    answer += currentSum;
                }
            }
        }
        // return the answer
        return answer;
    }


    // Approach 2: Two Loops
    // time complexity O(n^2)

    public static int sumOddLengthSubarrays_2(int[] arr) {
        int n = arr.length, answer = 0;

        // loop through the array
        for (int left = 0; left < n; ++left) {
            // initialize the current sum to 0
            int currentSum = 0;
            // loop through the array again starting from the left index and ending at the end of the array
            for (int right = left; right < n; ++right) {
                // add the current element to the current sum
                currentSum += arr[right];
                // if the length of the subarray is odd, add the current sum to the answer.
                answer += (right - left + 1) % 2 == 1 ? currentSum : 0;
            }
        }
        return answer;
    }

    // Approach 3: One Loop -> checking the occurrence of each element in the subarray.
    // time complexity O(n)

    public static int sumOddLengthSubarrays_3(int[] arr) {
        int n = arr.length, answer = 0;

        // loop through the array
        for (int i = 0; i < n; ++i) {
            // get the left and right occurrence of the current element
            int left = i, right = n - i - 1;
            // get the total number of subarrays that the current element is in
            // left/2 because the left occurrence can be divided into 2 parts, the right occurrence can be divided into 2 parts
            // + 1 because the current element can be in a subarray by itself
            answer += arr[i] * (left / 2 + 1) * (right / 2 + 1);
            answer += arr[i] * ((left + 1) / 2) * ((right + 1) / 2);
        }

        return answer;
    }

}
