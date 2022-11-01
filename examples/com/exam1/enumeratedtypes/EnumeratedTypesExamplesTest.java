package com.exam1.enumeratedtypes;

import org.junit.jupiter.api.Test;

class EnumeratedTypesExamplesTest {
    
    @Test
    void usingPublicEnums() {
        //notice having to use the class name then the enum name before accessing the actual value
        System.out.println(EnumeratedTypes.hAlignment.LEFT);
    }
    @Test
    void usingPrivateEnums() {
        /* can only use private enums inside the class in which they are nested */
    }
}