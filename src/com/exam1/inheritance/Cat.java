package com.exam1.inheritance;

public class Cat extends Animal{
    
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
}
