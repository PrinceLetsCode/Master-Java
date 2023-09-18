package leetCode;

public class CompressionAlgorithm {
    public static void main(String[] args) {
        int n = 2233351;
        System.out.println(compress(n));
    }

    private static String compress(int n) {
        char[] charArr = String.valueOf(n).toCharArray();
        char currChar = ' ';
        int count = 0;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < charArr.length) {
            if (currChar == charArr[i]) {
                count++;
                i++;
            } else {
                if (count > 0) {
                    sb.append(count);
                    sb.append(currChar);
                }
                currChar = charArr[i];
                count = 1;
                i++;
            }
        }
        if (count > 0) {
            sb.append(count);
            sb.append(currChar);
        }
        return sb.toString();
    }
}
