//https://proglib.io/p/java-sorting-algorithms
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 21, 1, 4, 6, 12};
        sort(arr);
        for(int i : arr) {
            System.out.println(i);
        }
    }

//O(n ^ 2)
    private static void sort(int[] arr) {
        int size = arr.length - 1;
        while (true) {
            Integer target = null;
            for (int i = 0; i < size; i++) {
                if (arr[i] > arr[i + 1]) {
                    target = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = target;
                }
            }
            size--;
            if (target == null) return;
        }
    }
}
