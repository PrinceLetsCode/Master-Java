package CodeChef;

public class TwoDishes {


    public static void find_max_diff(int N, int S) {
        int max_diff=-1;

/*        for (int i = 0; i <= N; i++) {
            for (int j = i; j <= S; j++) {
                if (i + j == S && (i - j) > max_diff) {
                    max_diff=i-j;
                }
            }
        }

        System.out.println(max_diff);*/



        if (S <= N) {
            max_diff=S;
        }
        else {
            max_diff=(N-S)+N;
        }
        System.out.println(max_diff);

    }

    public static void main(String[] args) {
        find_max_diff(2, 3);
    }

}
