import java.util.Arrays;
public class GenericMethod {
    static <T> void printArray(T[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (T item : arr) {
            if (item.compareTo(max) > 0) max = item;
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        String[] names = {"Java", "Spring", "React"};
        printArray(nums);
        printArray(names);
        swap(nums, 0, 4);
        System.out.println("After swap: " + Arrays.toString(nums));
        System.out.println("Max int: " + findMax(nums));
        System.out.println("Max string: " + findMax(names));
    }
}
