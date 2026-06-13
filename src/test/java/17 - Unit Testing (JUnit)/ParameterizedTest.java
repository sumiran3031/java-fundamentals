package unittesting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

public class ParameterizedTestDemo {

    ParameterizedDemo demo = new ParameterizedDemo();

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 10, 100})
    void testIsPositive(int number) {
        assertTrue(demo.isPositive(number));
    }

    @ParameterizedTest
    @CsvSource({
        "2, 4",
        "3, 9",
        "4, 16",
        "5, 25"
    })
    void testSquare(int input, int expected) {
        assertEquals(expected, demo.square(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "level"})
    void testPalindromes(String word) {
        assertTrue(demo.isPalindrome(word));
    }

    static Stream<String> nonPalindromes() {
        return Stream.of("hello", "world", "java");
    }

    @ParameterizedTest
    @MethodSource("nonPalindromes")
    void testNonPalindromes(String word) {
        assertFalse(demo.isPalindrome(word));
    }
}
