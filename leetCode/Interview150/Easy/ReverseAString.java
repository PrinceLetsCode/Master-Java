package leetCode.Interview150.Easy;

public class ReverseAString {

    public static void reverse(char[] Str) {

        int   left = 0;
        int right = Str.length-1;
        while(left<right)
        {    char temp = Str[left];
            Str[left] = Str[right];
            Str[right] = temp;
            left++;
            right--;
        }


        for (int i = 0; i < Str.length; i++) {
            System.out.println(Str[i] + " ");
        }
    }

    public static void main(String[] args) {
        char[] seq= {'h','e','l','l','o'};
        reverse(seq);


    }
}
