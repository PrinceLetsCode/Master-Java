package PrinceLetsCode2.Array;

public class TotalDistanceCovered {
    public static void main(String[] args) {
        int mainTank = 5;
        int additionalTank = 2;
        System.out.println(totalDistance(mainTank, additionalTank));
    }

    private static int totalDistance(int mainTank, int additionalTank) {
        int distance = 0;
        int currentTank = mainTank;

        while(currentTank > 0){
            currentTank--;
            distance += 10;

            if(currentTank == mainTank-5 && additionalTank > 0){
                currentTank += 1;
                additionalTank--;
                mainTank = currentTank;
            }
        }

        return distance;
    }
}
