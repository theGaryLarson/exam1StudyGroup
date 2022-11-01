package com.exam1.interfaces;
import static org.junit.jupiter.api.Assertions.*;
import com.exam1.inheritance.Car;
import org.junit.jupiter.api.Test;

class ComparableExampleTest {
    @Test
    void ImplementingComparableTest() {
        //debug this to see it in action
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