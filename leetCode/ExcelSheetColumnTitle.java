package leetCode;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int n = 701;
        System.out.println(convertToTitle(n));
    }

    private static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            sb.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
