package unittesting;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MockitoBasicsTest {

    interface UserRepository {
        String findUserById(int id);
        void saveUser(String name);
    }

    static class UserService {
        private UserRepository repository;

        UserService(UserRepository repository) {
            this.repository = repository;
        }

        String getUserGreeting(int id) {
            String user = repository.findUserById(id);
            return "Hello, " + user;
        }
    }

    @Test
    void testMockReturnValue() {
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findUserById(1)).thenReturn("Sumiran");

        UserService service = new UserService(mockRepo);
        String result = service.getUserGreeting(1);

        assertEquals("Hello, Sumiran", result);
    }

    @Test
    void testVerifyMethodCalled() {
        UserRepository mockRepo = mock(UserRepository.class);
        mockRepo.saveUser("Sumiran");

        verify(mockRepo).saveUser("Sumiran");
        verify(mockRepo, times(1)).saveUser(anyString());
    }

    @Test
    void testMockList() {
        @SuppressWarnings("unchecked")
        List<String> mockList = mock(List.class);
        when(mockList.size()).thenReturn(10);

        assertEquals(10, mockList.size());
        verify(mockList).size();
    }

    @Test
    void testRealVsMock() {
        List<String> realList = new ArrayList<>();
        realList.add("Java");
        assertEquals(1, realList.size());

        @SuppressWarnings("unchecked")
        List<String> mockList = mock(List.class);
        mockList.add("Java");
        assertEquals(0, mockList.size());
    }
}
