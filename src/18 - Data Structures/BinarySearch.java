public class BinarySearch {
    
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) return binarySearchRecursive(arr, mid + 1, right, target);
        else return binarySearchRecursive(arr, left, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};

        System.out.println("Array: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        System.out.println("Search 23 (iterative): index " + binarySearch(arr, 23));
        System.out.println("Search 10 (iterative): index " + binarySearch(arr, 10));

        System.out.println("Search 45 (recursive): index " +
                binarySearchRecursive(arr, 0, arr.length - 1, 45));
    }
}
