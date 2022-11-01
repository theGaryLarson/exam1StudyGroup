package com.exam1.inheritance;


import com.exam1.interfaces.Pettable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class AnimalExampleTest {
    @Test
    void interfaceExample() {
        //using polymorphism to call Pettable method pet() on Pettable instances
        ArrayList<Animal> animals = new ArrayList<>();
        Cat garfield = new Cat(12); // implements Pettable interface ctrl+leftClick Cat to see implementation
        Cow bessie = new Cow(400);
        animals.add(garfield);
        animals.add(bessie);
        for(Animal animal : animals) {
            System.out.println(animal.getClass());
            animal.makeNoise();
            if(animal instanceof Pettable) {  // checks if Animal is Pettable (i.e. implements Pettable interface)
                ((Pettable)animal).pet();     // casts animal to Pettable and calls pet method. Pay attention to the ().
            }
        }
    }
    
    
}