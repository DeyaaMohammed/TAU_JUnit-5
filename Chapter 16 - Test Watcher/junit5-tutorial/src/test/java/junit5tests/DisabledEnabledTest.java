package junit5tests;

import listeners.Listener;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
//Newly added listener @ExtendWith(Listener.class)
@ExtendWith(Listener.class)
public class DisabledEnabledTest {
    @Test
    @Disabled(value = "Disabled for demo of @Disabled")
    void firstTest(){
        System.out.println("This is the first test");
    }

    @Test
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Disabled for demo of @DisabledOnOs")
    void secondTest(){
        System.out.println("This is the second test");
    }

    @Test
    @DisabledIfSystemProperty(named =  "env", matches = "staging", disabledReason = "Disabled for demo of @DisabledIfSystemProperty")
    void thirdTest(){
        System.out.println("This is the third test");
    }

    @Test
    @DisabledIf(value = "provider", disabledReason = "Disabled for demo of @DisabledIf")
    void fourthTest(){
        System.out.println("This is the fourth test");
    }

    @Test
    void fifthTest(){
        System.out.println("This is the fifth test");
    }
    
    boolean provider(){
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.WEDNESDAY);
    }
}
