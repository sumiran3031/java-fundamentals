import java.util.*;
public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Sumiran");
        System.out.println("Value: " + name.get());
        System.out.println("isPresent: " + name.isPresent());
        Optional<String> empty = Optional.empty();
        System.out.println("isEmpty: " + empty.isEmpty());
        String result = empty.orElse("Default Value");
        System.out.println("orElse: " + result);
        String result2 = empty.orElseGet(() -> "Generated Value");
        System.out.println("orElseGet: " + result2);
        Optional<String> nullable = Optional.ofNullable(null);
        System.out.println("nullable isEmpty: " + nullable.isEmpty());
        Optional<Integer> length = name.map(String::length);
        System.out.println("Name length: " + length.get());
    }
}
