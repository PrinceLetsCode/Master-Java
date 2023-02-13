package leetCode.Interview150.Easy;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596)); // 964176192
    }

    private static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) + (n & 1);
            n >>= 1;
        }
        return res;
    }

}
