import java.util.Arrays;
public class StringArray {
    public static void main(String[] args) {
        String[] names = {"Sumiran", "Rahul", "Priya", "Amit"};
        System.out.println("Original: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted: " + Arrays.toString(names));
        String longest = "";
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        System.out.println("Longest name: " + longest);
    }
}
