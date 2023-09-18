package PrinceLetsCode2.Array;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'1','.','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'9','.','.','.','.','.','2','8','.'},
                {'2','.','.','4','1','9','.','.','5'},
                {'3','.','.','.','8','.','.','7','9'},
        };

        System.out.println(isValidSudoku(board));
    }


    // brute force with comments
    private static boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++){
                // check if the current cell is not empty
                if(board[i][j] != '.') {
                    // check if the current cell is valid
                    if(!isValid(board, i, j)) {
                        return false;
                    }

                }

            }
        }

        return true;
    }

    private static boolean isValid(char[][] board, int i, int j) {
        // check if the current cell is valid in its row
        for(int col = 0; col < board[0].length; col++) {
            if(col != j && board[i][col] == board[i][j]) {
                return false;
            }
        }

        // check if the current cell is valid in its column
        for(int row = 0; row < board.length; row++) {
            if(row != i && board[row][j] == board[i][j]) {
                return false;
            }
        }

        // check if the current cell is valid in its 3x3 sub-box
        int row = i / 3 * 3;
        int col = j / 3 * 3;

        for(int r = row; r < row + 3; r++) {
            for(int c = col; c < col + 3; c++) {
                if(r != i && c != j && board[r][c] == board[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }


    // optimized solution

    private static boolean isValidSudokuOptimized(char[][] board){
        int row = board.length;
        int col = board[0].length;

        boolean[][] rowCheck = new boolean[row][col];
        boolean[][] colCheck = new boolean[row][col];
        boolean[][] boxCheck = new boolean[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col ; j++){
                // check if the current cell is not empty
                if(board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1;
                    int boxIndex = i / 3 * 3 + j / 3;

                    // check if the current cell is valid in its row
                    if(rowCheck[i][num]) {
                        return false;
                    } else {
                        rowCheck[i][num] = true;
                    }

                    // check if the current cell is valid in its column
                    if(colCheck[j][num]) {
                        return false;
                    } else {
                        colCheck[j][num] = true;
                    }

                    // check if the current cell is valid in its 3x3 sub-box
                    if(boxCheck[boxIndex][num]) {
                        return false;
                    } else {
                        boxCheck[boxIndex][num] = true;
                    }
                }

            }
        }

        return true;
    }


}
