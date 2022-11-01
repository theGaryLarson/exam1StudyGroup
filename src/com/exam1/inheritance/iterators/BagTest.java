package com.exam1.inheritance.iterators;
import com.exam1.inheritance.Animal;
import com.exam1.inheritance.Cat;
import com.exam1.inheritance.Cow;
import com.exam1.iterators.Bag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    
    @org.junit.jupiter.api.Test
    void BagTest() {
        Bag<Animal> zooBag = new Bag<>();
        zooBag.add(new Cat(12));
        zooBag.add(new Cow(400));
        
        //because it implements the Iterable<E> interface we can use a for-each loop
        for(Animal a : zooBag) {
            System.out.println(a.getWeight());
        }
    }
}