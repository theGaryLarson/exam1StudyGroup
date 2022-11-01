package com.exam1.inheritance;

public class Cow extends Animal{
    
    public Cow(int weight) {
        super(weight);
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
    public void makeNoise() {
        System.out.println("Moo");
    }
}
