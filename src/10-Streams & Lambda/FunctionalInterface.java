import java.util.function.*;
public class FunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even: " + isEven.test(4));
        System.out.println("Is 7 even: " + isEven.test(7));
        Function<String, Integer> strLength = s -> s.length();
        System.out.println("Length: " + strLength.apply("Sumiran"));
        Consumer<String> printer = s -> System.out.println("Hello " + s);
        printer.accept("Java");
        Supplier<String> greeting = () -> "Good Morning!";
        System.out.println(greeting.get());
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(10, 20));
    }
}
