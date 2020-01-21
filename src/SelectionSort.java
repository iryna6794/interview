//https://proglib.io/p/java-sorting-algorithms
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {24, 3, 5, 21, 1, 4, 6, 12};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
// O(n^2)
    private static void sort(int[] arr) {
        for(int k = 0; k < arr.length; k++) {
            int min = arr[k];
            int pos = k;
            for (int i = k + 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    pos = i;
                }
            }
            arr[pos] = arr[k];
            arr[k] = min;
        }
    }
}

/*
Сортировка выбором

Сортировка выбором тоже разделяет массив на сортированный и несортированный подмассивы.
Но на этот раз сортированный подмассив формируется вставкой минимального элемента
не отсортированного подмассива в конец сортированного, заменой:

    3 5 1 2 4
    1 5 3 2 4
    1 2 3 5 4
    1 2 3 5 4
    1 2 3 4 5
    1 2 3 4 5
 */