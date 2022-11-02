package com.exam1.statics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/** This is an example of using a static to ensure only one instance of your class (maybe an app) can be created
 * at one time
 */
class SingletonTest {
    @Test
    void ensureThrowsExceptionIfMoreThanOneInstance() {
        //view Singleton class in com.exam1.statics to see implementation
        Singleton firstSingletonInstance = new Singleton();
        assertThrows(ExceptionInInitializerError.class, () -> {
            Singleton SecondNotAllowed = new Singleton();
        });
    }
}