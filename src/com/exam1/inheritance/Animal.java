package com.exam1.inheritance;

public abstract class Animal {
    int weight;
    public Animal(int weight) {
        this.weight = weight;
    }
    public abstract void makeNoise();
    public abstract void setWeight(int weight);
    public abstract int getWeight();
}
