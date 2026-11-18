package Nov2026.SystemDesign;

public class DesingParkingSystem {
    int big;
    int medium;
    int small;

    public DesingParkingSystem(int big, int medium, int small){
        this.big=big;
        this.small=small;
        this.medium=medium;
    }
    public boolean addCar(int carType){
        if(carType == 1 && big >0){
            big--;
            return true;
        }
        else if(carType ==2 && medium >0){
            medium--;
            return true;
        }
        else if(carType ==3 && small >0){
            small--;
            return true;
        }
        return false;

    }


    public static void main(String[] args) {
        
        DesingParkingSystem parking = new DesingParkingSystem(1,1,0);
        System.out.println(parking.addCar(1));
        System.out.println(parking.addCar(2));
        System.out.println(parking.addCar(3));
        System.out.println(parking.addCar(1));
    }
}
