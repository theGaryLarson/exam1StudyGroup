package com.exam1.generics;
import com.exam1.inheritance.Animal;
import com.exam1.inheritance.Car;
import org.junit.jupiter.api.Test;

class ContainerExampleTest {
    @Test
    void differentTypes() {
        //cannot use primitive types with generics so must use wrapper class of each type
        //optimal use of primitive types is storing in an array. Use other Collections only if necessary.
        Container<Byte> bytes = new Container<>();
        Container<Short> shorts = new Container<>();
        Container<Integer> ints = new Container<>();
        Container<Long> longs = new Container<>();
        Container<Float> floats = new Container<>();
        Container<Double> doubles = new Container<>();
        Container<Boolean> booleans = new Container<>();
        //char does not have a wrapper type. We use String
        Container<String> strings = new Container<>();
       
        //custom types
        Container<Car> garage = new Container<>();
        Container<Animal> zoo = new Container<>();
        
    }
    
    
}