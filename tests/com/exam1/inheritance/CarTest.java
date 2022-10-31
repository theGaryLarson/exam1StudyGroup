package com.exam1.inheritance;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

class CarTest {
    @Test
    void polymorphism() {
        Car toyota = new Car("Toyota Camry", "V6", Color.RED);
        ElectricCar tesla = new ElectricCar("Tesla", "hybrid", Color.GRAY, true);
    
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(toyota);
        cars.add(tesla);
        //this is a for each loop. More detail when covering Iterator
        for( Car currentCar : cars) {
            System.out.println(currentCar.getModel());
        }
        
    }
}