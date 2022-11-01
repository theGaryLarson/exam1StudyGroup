package com.exam1.iterators;
import com.exam1.inheritance.Car;
import com.exam1.interfaces.ComparableExample;
import com.exam1.generics.Container;
import java.util.Iterator;

/** more examples of for-each loop and iterators in examples/com/iterators folder */
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
        
        //ctrl + left click Container to see how we used Generics to create a strongly typed iterator
        Container<String> inventory = new Container<>();
        inventory.add("pencil");
        inventory.add("paper");
        inventory.add("coffee mug");
        inventory.add("red stapler");
        inventory.add("TPS report");
        
        Iterator<String> invIterator = inventory.iterator();
        while(invIterator.hasNext()) {
            String currentItem = invIterator.next();
            System.out.println(currentItem);
        }
        
    }
    
}
