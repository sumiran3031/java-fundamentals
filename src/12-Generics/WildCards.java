import java.util.Arrays;
import java.util.List;
public class WildCards {
    static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    static double sumList(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
    static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strs = Arrays.asList("Java", "Spring", "React");
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        printList(ints);
        printList(strs);
        System.out.println("Sum: " + sumList(ints));
        System.out.println("Sum: " + sumList(doubles));
    }
}
