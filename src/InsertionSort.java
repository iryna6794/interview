public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {24, 3, 5, 21, 1, 4, 6, 12};
//        sort(arr);
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
//O(n ^ 2)
    private static void sort(int[] arr) {
        int length = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                for (int k = length - 1; k > 0; k--) {
                    if (arr[k] < arr[k - 1]) {
                        temp = arr[k];
                        arr[k] = arr[k - 1];
                        arr[k - 1] = temp;
                    } else {
                        break;
                    }
                }
            }
            length++;
        }
    }
//O(n ^ 2)
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}
