package com.exam1.iterators;
import com.exam1.inheritance.Car;
import com.exam1.interfaces.ComparableExample;

import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        //ctrl + left click ComparableExample to see internals
        ComparableExample suppliedIterator = new ComparableExample();
        Iterator<Car> carIterator = suppliedIterator.getCars().iterator();
        System.out.println("--Iterator Example--");
        while(carIterator.hasNext()) {
            Car currentCar = carIterator.next();
            System.out.println(currentCar.toString());
        }
    }
    
}
