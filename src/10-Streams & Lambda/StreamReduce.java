import java.util.*;
import java.util.stream.*;
public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);
        Optional<Integer> max = numbers.stream()
                .reduce((a, b) -> a > b ? a : b);
        System.out.println("Max: " + max.get());
        Optional<Integer> min = numbers.stream()
                .reduce((a, b) -> a < b ? a : b);
        System.out.println("Min: " + min.get());
        long count = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Even count: " + count);
    }
}
