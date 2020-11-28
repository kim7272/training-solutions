package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    public void sayHelloTest() {
        //Given
        String name = "John Doe";

        //When
        String greeting = new Gentleman().sayHello(name);

        //Then
        assertEquals("Hello John Doe.", greeting);
    }

    @Test
    public void sayHelloTestZeroCase() {
        //Given
        String name = null;

        //When
        String newGreeting = new Gentleman().sayHello(name);

        //Then
        assertEquals("Hello Anonymous!", newGreeting);
    }
}