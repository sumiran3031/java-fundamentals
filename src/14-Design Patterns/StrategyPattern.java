public class StrategyPattern {
    interface SortStrategy {
        void sort(int[] arr);
        String getName();
    }

    static class BubbleSort implements SortStrategy {
        public void sort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++)
                for (int j = 0; j < arr.length - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
        }
        public String getName() { return "Bubble Sort"; }
    }

    static class SelectionSort implements SortStrategy {
        public void sort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < arr.length; j++)
                    if (arr[j] < arr[minIdx]) minIdx = j;
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
        public String getName() { return "Selection Sort"; }
    }

    static class Sorter {
        private SortStrategy strategy;

        Sorter(SortStrategy strategy) {
            this.strategy = strategy;
        }

        void setStrategy(SortStrategy strategy) {
            this.strategy = strategy;
        }

        void sort(int[] arr) {
            System.out.println("Using: " + strategy.getName());
            strategy.sort(arr);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
        int[] arr2 = {64, 25, 12, 22, 11};

        Sorter sorter = new Sorter(new BubbleSort());
        sorter.sort(arr1);
        System.out.print("Result: ");
        for (int x : arr1) System.out.print(x + " ");

        System.out.println();

        sorter.setStrategy(new SelectionSort());
        sorter.sort(arr2);
        System.out.print("Result: ");
        for (int x : arr2) System.out.print(x + " ");
    }
}
