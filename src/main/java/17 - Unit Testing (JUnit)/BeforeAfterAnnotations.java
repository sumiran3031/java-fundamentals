import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BeforeAfterAnnotations {

    private List<String> list;

    @BeforeAll
    static void setupClass() {
        System.out.println("Runs once before all tests");
    }

    @BeforeEach
    void setup() {
        list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        System.out.println("Runs before each test - list initialized");
    }

    @Test
    void testAddElement() {
        list.add("React");
        assertEquals(3, list.size());
    }

    @Test
    void testRemoveElement() {
        list.remove("Java");
        assertEquals(1, list.size());
        assertFalse(list.contains("Java"));
    }

    @Test
    void testInitialSize() {
        // each test gets fresh list due to @BeforeEach
        assertEquals(2, list.size());
    }

    @AfterEach
    void tearDown() {
        list.clear();
        System.out.println("Runs after each test - list cleared");
    }

    @AfterAll
    static void tearDownClass() {
        System.out.println("Runs once after all tests");
    }

    @Test
    @DisplayName("Custom test name - checks list is not null")
    void testListNotNull() {
        assertNotNull(list);
    }

    @Test
    @Disabled("Skipping this test temporarily")
    void testDisabled() {
        fail("This should not run");
    }
}
