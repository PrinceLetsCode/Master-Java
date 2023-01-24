package leetCode;

import javax.swing.*;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command="(al)G(al)()()G";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        int i=0;
        String result="";
        while (i < command.length()) {
            if (command.charAt(i)=='G'){
                result+="G";
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                result+="al";
                i=i+4;
            } else if (command.charAt(i) == '(') {
                result += 'o';
                i=i+2;
            }
        }
        return result;
    }
}
