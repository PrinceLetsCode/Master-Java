package Bit_manipulation;

public class DetectCapital {
    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }

    private static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();

        boolean firstCapital = false;
        boolean firstSmall = false;
        boolean allSmall = false;
        boolean allCapital = false;
        boolean allSmallExceptFirst = false;


        // check for first capital
        if(chars[0]>=65 && chars[0]<=90){
            firstCapital = true;
        }

        // check for first small
        if(chars[0]>=97 && chars[0]<=122){
            firstSmall = true;
        }

        // check for all small

        for(int i = 0;i<chars.length;i++){
            if(chars[i]>=97 && chars[i]<=122){
                allSmall = true;
            }
            else{
                allSmall = false;
                break;
            }
        }

        // check for all capital

        for(int i = 0;i<chars.length;i++){
            if(chars[i]>=65 && chars[i]<=90){
                allCapital = true;
            }
            else{
                allCapital = false;
                break;
            }
        }

        // check for all small except first

        for(int i = 1;i<chars.length;i++){
            if(chars[i]>=97 && chars[i]<=122){
                allSmallExceptFirst = true;
            }
            else{
                allSmallExceptFirst = false;
                break;
            }
        }

        if(firstCapital && allCapital){
            return true;
        }
        else if(firstCapital && allSmallExceptFirst){
            return true;
        }
        else if(firstSmall && allSmall){
            return true;
        }
        else{
            return false;
        }

    }
}
