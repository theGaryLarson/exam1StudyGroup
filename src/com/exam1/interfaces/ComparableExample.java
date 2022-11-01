package com.exam1.interfaces;
import com.exam1.inheritance.Car;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

/** Will sort Cars. In order to do that Cars must implement Comparable<Car> */
public class ComparableExample {
    ArrayList<Car> cars = new ArrayList<>();
    
    public ComparableExample() {
        //creating arguments for instantiating a series of Car objects
        String[] models = new String[]{"Toyota", "Honda", "Volvo", "Porsche", "Mercedes", "Hyundai", "BMW"};
        String[] engines = new String[]{"v6", "v8", "v6", "Diesel", "v8", "v4", "v6"};
        Color[] paints = new Color[]{new Color(125, 125,125), new Color(255, 0, 0),
                new Color(0,255,0), new Color(0, 0, 255), new Color(125, 125, 0),
                new Color(175, 95, 95), new Color(0, 0 ,0)};
        // creating Car objects from the above lists
        for (int idx = 0; idx < models.length; idx++) {
            cars.add(new Car(models[idx], engines[idx], paints[idx]));
        }
    }
    public ArrayList<Car> getCars() {
        return cars;
    }
    
    public void sortCars() {
        Collections.sort(cars);
        //another way to sort. Collections.sort calls the toArray() method under-the-hood
        //Arrays.sort(cars.toArray());
    }
  
    
}
