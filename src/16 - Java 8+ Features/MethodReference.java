import java.util.*;
import java.util.function.*;

public class MethodReference {
    static void printUpper(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "spring", "react");

        names.forEach(MethodReference::printUpper);

        String prefix = "Hello ";
        Function<String, String> greet = prefix::concat;
        System.out.println(greet.apply("World"));
        Function<String, Integer> length = String::length;
        System.out.println("Length: " + length.apply("Sumiran"));

        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        ArrayList<String> newList = listSupplier.get();
        newList.add("Created via constructor reference");
        System.out.println(newList);
        List<String> mutable = new ArrayList<>(names);
        mutable.sort(String::compareTo);
        System.out.println("Sorted: " + mutable);
    }
}
