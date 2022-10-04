package CodeChef;

import java.util.Scanner;

public class StudyingAlphabet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.next();
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            String str = s.next();
            String ans = "Yes";
            for(int j=0;j<str.length();j++){
                String m =Character.toString(str.charAt(j));
                if(!S.contains(m)){
                    ans = "No";
                }
            }
            System.out.println(ans);
        }
    }

}
