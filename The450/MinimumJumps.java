package The450;


public class MinimumJumps {

    public static void find_jumps(int[] arr) {

        int count=0;
    int i=0;
    int n=arr.length;
    while(i<n){
        if (arr[i] == 0) {
            System.out.println(-1);
            return;
        }
        else {
            i = i + arr[i];
            count++;
        }

        }
        System.out.println(count);

    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 0};
        find_jumps(arr);

    }
}
