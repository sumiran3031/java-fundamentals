import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

public class ParameterizedTest {

    boolean isPositive(int n) {
        return n > 0;
    }

    int square(int n) {
        return n * n;
    }

    boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(ints = {1, 5, 10, 100})
    void testIsPositive(int number) {
        assertTrue(isPositive(number));
    }
    @org.junit.jupiter.params.ParameterizedTest
    @CsvSource({
        "2, 4",
        "3, 9",
        "4, 16",
        "5, 25"
    })
    void testSquare(int input, int expected) {
        assertEquals(expected, square(input));
    }
    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "level"})
    void testPalindromes(String word) {
        assertTrue(isPalindrome(word));
    }
    static Stream<String> nonPalindromes() {
        return Stream.of("hello", "world", "java");
    }

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource("nonPalindromes")
    void testNonPalindromes(String word) {
        assertFalse(isPalindrome(word));
    }
}
