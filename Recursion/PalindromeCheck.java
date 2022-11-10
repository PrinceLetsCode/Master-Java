package Recursion;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(palindromeCheck_Iteration("madam"));
        System.out.println(palindromeCheck_Recursion_functional("madam"));
        System.out.println(palindromeCheck_Recursion_parameterized("madam",0));

    }

    private static boolean palindromeCheck_Iteration(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean palindromeCheck_Recursion_functional(String str) {
        if(str.length()==0 || str.length()==1){
            return true;
        }
        if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }
        return palindromeCheck_Recursion_functional(str.substring(1,str.length()-1));
    }



    private static boolean palindromeCheck_Recursion_parameterized(String str, int i) {

        if(i<=str.length()/2 && str.charAt(i)!=str.charAt(str.length()-1-i)){
            return false;
        }
        if(i>str.length()/2){
            return true;
        }
        return palindromeCheck_Recursion_parameterized(str,i+1);
    }
}
