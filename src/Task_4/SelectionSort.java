package Task_4;

import java.util.Comparator;

public class SelectionSort<T> implements SortAlg<T> {
    public void sort(T[] array, Comparator<T> comparator) {
        int n = array.length;
        int comparisons = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(array[j], array[minIndex]) < 0) {
                    minIndex = j;
                }
                comparisons++;
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.println("Array after selection sort:");
        for (T item : array) {
            System.out.println(item);
        }
        System.out.println("Number of comparison operations: " + comparisons);
    }
}
