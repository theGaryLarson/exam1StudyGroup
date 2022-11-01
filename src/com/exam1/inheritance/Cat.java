package com.exam1.inheritance;

import com.exam1.interfaces.Pettable;
/** implements Pettable detailed in interfaces package */
public class Cat extends Animal implements Pettable {
    
    public Cat(int weight) {
        super(weight);
    }
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
    
    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public int getWeight() {
        return weight;
    }
    
    @Override
    public void pet() {
        System.out.println("prrrr...");
    }
}
