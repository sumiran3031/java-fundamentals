import java.util.HashSet;
import java.util.TreeSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // duplicate
        set.add("React");
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size()); // 3 not 4
        System.out.println("Contains Java: " + set.contains("Java"));
        set.remove("Python");
        System.out.println("After remove: " + set);
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        System.out.println("TreeSet (sorted): " + treeSet);
        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());
    }
}
