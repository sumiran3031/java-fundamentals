import java.util.*;
import java.util.stream.*;
public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Evens: " + evens);
        List<Integer> greaterThan5 = numbers.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList());
        System.out.println("Greater than 5: " + greaterThan5);
        List<String> names = Arrays.asList("Java", "Spring", "React", "Go", "Python");
        List<String> longNames = names.stream()
                .filter(s -> s.length() > 4)
                .collect(Collectors.toList());
        System.out.println("Long names: " + longNames);
    }
}
