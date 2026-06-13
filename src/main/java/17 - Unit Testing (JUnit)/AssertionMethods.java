import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class AssertionMethods {

    @Test
    void testEquals() {
        assertEquals(5, 2 + 3);
        assertEquals("Java", "Java");
    }

    @Test
    void testNotEquals() {
        assertNotEquals(5, 2 + 4);
    }

    @Test
    void testTrueFalse() {
        assertTrue(5 > 3);
        assertFalse(5 < 3);
    }

    @Test
    void testNull() {
        String s = null;
        assertNull(s);

        String s2 = "Java";
        assertNotNull(s2);
    }

    @Test
    void testArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSame() {
        String a = "Java";
        String b = a;
        assertSame(a, b); // same reference
    }

    @Test
    void testAll() {
        // assertAll - groups multiple assertions
        assertAll("Person properties",
            () -> assertEquals("Sumiran", "Sumiran"),
            () -> assertEquals(21, 21),
            () -> assertTrue(21 > 18)
        );
    }

    @Test
    void testIterableEquals() {
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = Arrays.asList(1, 2, 3);
        assertIterableEquals(expected, actual);
    }

    @Test
    void testTimeout() {
        assertTimeout(java.time.Duration.ofMillis(100), () -> {
            // task that should complete within 100ms
            Thread.sleep(50);
        });
    }
}
