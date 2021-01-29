package week03d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneParserTest {

    @Test
    void parse() {

    Phone actual = new PhoneParser().parse("36-785284");

    assertEquals("The number with prefix is: 36-785284", actual.toString());
    }
}