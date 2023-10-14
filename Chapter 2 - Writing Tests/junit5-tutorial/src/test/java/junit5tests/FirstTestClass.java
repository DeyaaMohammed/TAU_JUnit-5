package junit5tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTestClass {
    @Test
    //Does not require Access Modifier but does not allow "private"
    //Does not allow any returns - Has to be void
    void firstMethod(){
        System.out.println("This is the first test method");
    }

    @Test
    @DisplayName("US1234 - TC12 - this method is the second one ")
    void secondMethod(){
        System.out.println("This is the second test method");
    }
}
