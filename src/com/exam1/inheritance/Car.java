package com.exam1.inheritance;

import java.awt.*;

public class Car {
    String model;
    String engine;
    Color paint;
    
    public Car(String model, String engine, Color paint) {
        this.model = model;
        this.engine = engine;
        this.paint = paint;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getEngine() {
        return engine;
    }
    
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    public Color getPaint() {
        return paint;
    }
    
    public void setPaint(Color paint) {
        this.paint = paint;
    }
}
