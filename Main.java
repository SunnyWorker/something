package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Main{
    public static void main (String [] args) {
        ArrayList<Car> arrCar = CarUtilityClass.createCars(10);
        arrCar.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if(o1.getWeight()>o2.getWeight()) return 1;
                else if(o1.getWeight()<o2.getWeight()) return -1;
                else return 0;
            }
        });
        System.out.println("Cars sorted by weight:\n");
        for (Car car : arrCar) {
            System.out.println(car.toString());
            car.start();
            car.run();
            car.stop();
            car.move();
            System.out.println();
        }

    }
}