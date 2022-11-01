package com.exam1.interfaces;
import com.exam1.inheritance.Car;
import org.junit.jupiter.api.Test;

class ComparableExamplesTest {
    @Test
    void ImplementingComparable() {
        //debug this to see it in action or ctrl+leftClick ComparableExample to see implementation
        ComparableExample sortExample = new ComparableExample();
        //unsorted
        for(Car car : sortExample.getCars()) {
            System.out.println(car);
        }
        System.out.println("------------------------");
        sortExample.sortCars();
        //sorted
        for(Car car : sortExample.getCars()) {
            System.out.println(car);
        }
    }
    
}