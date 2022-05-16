package com.company;

import java.util.ArrayList;

public class CarUtilityClass {
    public static ArrayList<Car> createCars(int count) {
        ArrayList<Car> arrCar = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrCar.add(new Car(CarNames.marks[i%10], CarNames.models[i%10], (int) (Math.random()*300+200),
                    (int) (Math.random()*10+15), Math.random()*30+30, Math.random()*3+1));
        }
        return arrCar;
    }
}
