import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EnumeratedTypesTest {
    
    @Test
    void usingPublicEnums() {
        //notice having to use the class name then the enum name before accessing the actual value
        System.out.println(EnumeratedTypes.hAlignment.LEFT);
    }
    @Test
    void usingPrivateEnums() {
        /** can only use inside the class in which they are nested */
    }
}