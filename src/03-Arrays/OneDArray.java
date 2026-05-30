public class OneDArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // print all elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // sum of array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
