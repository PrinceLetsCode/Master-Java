package leetCode;

import java.util.ArrayList;
import java.util.HashSet;

public class ValidSudoku {


    public static boolean isSudoku_2(char[][] board) {
        // check if the board is valid
        if (board == null || board.length != 9 || board[0].length != 9) {
            return false;
        }

        // create a hashset to store the values
        HashSet<String> hs=new HashSet<>();

        // loop through the board
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] != '.'){  // if the value is not a dot then add it to the hashset.
                    int o=i/3+(3*(j/3)); // calculate the box number
                    String r="r"+i+board[i][j];  // create a string with the row number and the value
                    String c="c"+j+board[i][j];  // create a string with the column number and the value
                    String g="g"+o+board[i][j];  // create a string with the box number and the value
                    if(hs.contains(r)||hs.contains(c)||hs.contains(g)){  // if the hashset contains any of the strings then return false
                        return false ;
                    }else { // else add the strings to the hashset
                        hs.add(r);
                        hs.add(c);
                        hs.add(g);
                    }}
            }
        }

        // return true.
        return true;
    }



    public static void main(String[] args) {

        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isSudoku_2(board));

    }
}
