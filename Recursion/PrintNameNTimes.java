package Recursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        printNameNTimes("Sarthak",5);
    }

    private static void printNameNTimes(String sarthak, int i) {
        if(i==0){
            return;
        }
        System.out.println(sarthak);
        printNameNTimes(sarthak,i-1);
    }
}
