package com.exam1.inheritance;

import java.awt.*;

public class ElectricCar extends Car{
    //this is a new field in addition to the parent class Car
    boolean isCharged;
    public ElectricCar(String model, String engine, Color paint, boolean isCharged) {
        //notice did not need to create fields for these because they are already allocated in the parent class
        super(model, engine, paint);
        this.isCharged = isCharged;
    }
}
