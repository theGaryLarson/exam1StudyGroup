package com.exam1.inheritance;

public class Cow extends Animal implements Pettable{
    
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
    
    @Override
    public void cuddle() {
        System.out.println("prrprr");
    }
    
    @Override
    public void pet() {
        System.out.println("prrrr...");
    }
}
