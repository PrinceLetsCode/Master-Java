package leetCode.Interview150.Easy;

public class ExcelColumnSheetNumber {
    public static void main(String[] args) {
//        System.out.println(titleToNumber("A")); // 1
//        System.out.println(titleToNumber("AB")); // 28
        System.out.println(titleToNumber("ZY")); // 701
    }

    private static int titleToNumber(String columnTitle) {
        int res=0;
        for(char ch:columnTitle.toCharArray()){
            res = res * 26 + (ch - 'A') + 1;
        }
        return res;
    }
}
