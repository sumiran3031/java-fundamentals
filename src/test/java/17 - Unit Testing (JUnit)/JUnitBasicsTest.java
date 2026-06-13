package unittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitBasicsTest {

    @Test
    void testAdd() {
        JUnitBasics calc = new JUnitBasics();
        assertEquals(8, calc.add(5, 3));
    }

    @Test
    void testSubtract() {
        JUnitBasics calc = new JUnitBasics();
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void testIsEven() {
        JUnitBasics calc = new JUnitBasics();
        assertTrue(calc.isEven(4));
        assertFalse(calc.isEven(5));
    }

    @Test
    void testGreet() {
        JUnitBasics calc = new JUnitBasics();
        assertEquals("Hello, Sumiran", calc.greet("Sumiran"));
    }

    @Test
    void testGreetThrowsException() {
        JUnitBasics calc = new JUnitBasics();
        assertThrows(IllegalArgumentException.class, () -> calc.greet(""));
    }
}
