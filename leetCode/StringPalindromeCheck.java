package leetCode;

public class StringPalindromeCheck {


    public static void palindrome_check(char[] str) {

        char[] og = new char[str.length];

        for (int i = 0; i < str.length; i++) {
            og[i] = str[i];
        }

        int   left = 0;
        int right = str.length-1;
        while(left<right)
        {    char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }

        boolean flag=false;
        for (int i = 0; i < og.length; i++) {
            if (og[i] == str[i]) {
                flag=true;
            }
            else {
                flag=false;
            }
        }

        if (flag == true) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }




    }

    public static void main(String[] args) {

        char[] prince = {'p', 'r', 'i', 'n', 'c', 'e' };
        char[] example = {'1', '2', '3', '2', '1' };

        palindrome_check(prince);
        palindrome_check(example);

    }
}
