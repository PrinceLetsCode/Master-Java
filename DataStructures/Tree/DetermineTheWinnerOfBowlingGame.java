package DataStructures.Tree;

public class DetermineTheWinnerOfBowlingGame {
    public static void main(String[] args) {
        int[] player1 = {1,2,10,10,5,6};
        int[] player2 ={10,2,3,4,5,6};

        System.out.println(determineTheWinnerOfBowlingGame(player1,player2));
    }

    private static int determineTheWinnerOfBowlingGame(int[] player1, int[] player2) {
        int doubleFlag = 0;
        int player1Score = 0;
        int player2Score = 0;

        for(int i : player1){
            player1Score += doubleFlag>0 ? i*2 : i;
            doubleFlag--;
            if(i == 10){
                doubleFlag = 2;
            }
        }

        doubleFlag = 0;

        for(int i : player2){
            player2Score += doubleFlag>0 ? i*2 : i;
            doubleFlag--;
            if(i == 10){
                doubleFlag = 2;
            }
        }

        if (player1Score > player2Score) return 1;
        if (player1Score < player2Score) return 2;
        return 0;
    }
}
