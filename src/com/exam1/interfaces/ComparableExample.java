package com.exam1.interfaces;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.exam1.inheritance.Car;
/** container/manager that will sort Cars in order to do that Cars must implement Comparable<Car> */
public class ComparableExample {
    ArrayList<Car> cars = new ArrayList<>();
    
    public ComparableExample() {
        String[] models = new String[]{"Toyota", "Honda", "Volvo", "Porsche", "Mercedes", "Hyundai", "BMW"};
        String[] engines = new String[]{"v6", "v8", "v6", "Diesel", "v8", "v4", "v6"};
        Color[] paints = new Color[]{new Color(125, 125,125), new Color(255, 0, 0),
                new Color(0,255,0), new Color(0, 0, 255), new Color(125, 125, 0),
                new Color(175, 95, 95, 255), new Color(0, 0 ,0)};
        for (int idx = 0; idx < models.length; idx++) {
            cars.add(new Car(models[idx], engines[idx], paints[idx]));
        }
        //another way to sort
        //Arrays.sort(cars.toArray());
    }
    public ArrayList<Car> getCars() {
        return cars;
    }
    public void sortCars() {
        Collections.sort(cars);
    }
  
    
}
