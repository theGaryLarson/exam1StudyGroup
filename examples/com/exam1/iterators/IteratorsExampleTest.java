package com.exam1.iterators;
import com.exam1.generics.Container;
import com.exam1.inheritance.*;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Iterator;

class IteratorsExampleTest {
    
    @Test
    void ZooExample() {
        Container<Animal> zoo = new Container<>();
        zoo.add(new Cat(12));
        zoo.add(new Cow(400));
        
        //because it implements the Iterable<E> interface we can use a for-each loop
        for(Animal a : zoo) {
            System.out.println(a.getWeight());
        }
        //this is what is happening under-the-hood in the for-each loop
        Iterator<Animal> animalIterator = zoo.iterator();
        while(animalIterator.hasNext()) {
            //these two lines below can be removed and the third line uncommented to do a chained call
            Animal a = animalIterator.next();
            System.out.println(a.getWeight());
            //System.out.println(animalIterator.next().getWeight());
        }
    }
    
    @Test
    void fillGarage() {
        /* several concepts tied together here. Inheritance, Polymorphism, Generic Types, Iterators */
        Container<Car> garage = new Container<>();
        garage.add(new Car("Ford", "v4", Color.RED));
        garage.add(new ElectricCar("Prius", "hybrid", Color.BLUE, true));
        
        for(Car currentCar : garage) {
            System.out.println(currentCar.getModel());
            if (currentCar instanceof ElectricCar) {
                System.out.println("\tBattery Charged: " + ((ElectricCar) currentCar).isCharged());
            }
        }
        //this is what is happening under-the-hood in the for-each loop
        Iterator<Car> carIterator = garage.iterator();
        while (carIterator.hasNext()) {
            Car currentCar = carIterator.next();
            System.out.println(currentCar.getModel());
            if(currentCar instanceof ElectricCar) {
                System.out.println("\tBattery Charged: " + ((ElectricCar) currentCar).isCharged());
            }
        }
    }
}