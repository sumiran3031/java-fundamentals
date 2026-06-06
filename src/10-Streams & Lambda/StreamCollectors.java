import java.util.*;
import java.util.stream.*;
public class StreamCollectors {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
            "Java", "Spring", "React", "Docker", "Java", "AWS"
        );
        List<String> list = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct: " + list);
        String joined = names.stream()
                .distinct()
                .collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);
        Map<Integer, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + grouped);
        Map<String, Long> counting = names.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("Counting: " + counting);
    }
}
