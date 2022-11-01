package com.exam1.inheritance;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class AnimalTest {
    @Test
    void interfaceTest() {
        //using polymorphism to call Pettable method pet() on Pettable instances
        ArrayList<Animal> animals = new ArrayList<>();
        Cat garfield = new Cat(12);
        Cow bessie = new Cow(400);
        animals.add(garfield);
        animals.add(bessie);
        for(Animal anim : animals) {
            if(anim instanceof Pettable) {
                ((Pettable)anim).pet();
            }
        }
    }
    
    
}