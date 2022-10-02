package leetCode;



/*
The string split() method breaks a given string around matches of the given regular expression. After splitting
against the given regular expression, this method returns a string array.
*/

public class Length_Of_Last_Word {

    public static void main(String[] args) {
        String sentence = "What's best? Programming";

        //splitting the string with a regex for whitespaces.
        String[] arr = sentence.split("\\s");
        System.out.println(arr[arr.length-1].length());
    }
}
