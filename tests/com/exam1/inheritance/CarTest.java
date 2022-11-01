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
        //adding these to a strongly typed array list of Cars allows us to call methods
        //that belong to car because we have set up a contract by inheriting the methods when extending Car
        cars.add(toyota);
        cars.add(tesla);
        //this is a for each loop. (More detail when covering Iterator)
        //example of calling methods inherited from car on both the Car and ElectricCar objects
        for( Car currentCar : cars) {
            System.out.println("------------------------");
            System.out.println(currentCar.getClass());
            System.out.println(currentCar.getModel());
            System.out.println(currentCar.getEngine());
            System.out.println(currentCar.getPaint());
            System.out.println("------------------------");
            
        }
        
    }
}