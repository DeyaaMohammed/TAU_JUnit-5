package junit5tests;

import org.junit.jupiter.api.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class FirstTestClass {
    @BeforeAll
        //Does not require Access Modifier but does not allow "private"
        //Does not allow any returns - Has to be void
    void beforeAll(){
        System.out.println("--This is the before all method");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("----This is the before each method");
    }

    @AfterAll
    void afterAll(){
        System.out.println("--This is the after all method");
    }

    @AfterEach
    void afterEach(){
        System.out.println("----This is the after each method");
    }
    
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
