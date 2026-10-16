package Oct2026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

class SortByYear implements Comparator<Car> {

    @Override
    public int compare(Car a, Car b) {

        if (a.year < b.year){
            return -1;
        }
         else if (a.year > b.year){
            return 1;
         }
         

        return 0;
    }
}

public class ComparatorSort {

    public static void main(String[] args) {

        ArrayList<Car> myCar = new ArrayList<>();

        myCar.add(new Car("BMW", "X5", 2025));
        myCar.add(new Car("Fortuner", "Lstop", 2026));
        myCar.add(new Car("Thar Roxx", "AXL", 2026));

        Comparator<Car> myComparator = new SortByYear();

        Collections.sort(myCar, myComparator);

        for (Car c : myCar) {
            System.out.println(
                c.brand + " " +
                c.model + " " +
                c.year
            );
        }
    }
}