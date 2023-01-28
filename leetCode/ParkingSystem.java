package leetCode;

public class ParkingSystem {
    int big, medium, small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if(carType == 1) {
            if(big > 0) {
                big--;
                return true;
            }
        } else if(carType == 2) {
            if(medium > 0) {
                medium--;
                return true;
            }
        } else if(carType == 3) {
            if(small > 0) {
                small--;
                return true;
            }
        }
        return false;
    }
}

/*

=============================
can also be solved like this:
=============================
class ParkingSystem {

    private int[] count;
    public ParkingSystem(int big, int medium, int small) {
        count = new int[]{0, big, medium, small};
    }

    public boolean addCar(int carType) {
        return count[carType]-- > 0;
    }
}
*/