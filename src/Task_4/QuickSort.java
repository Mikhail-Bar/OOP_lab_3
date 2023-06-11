package Task_4;

import java.util.Comparator;

public class QuickSort<T> implements SortAlg<T> {
    public void sort(T[] array, Comparator<T> comparator) {
        int comparisons = 0;
        quickSort(array, 0, array.length - 1, comparator, comparisons);

        System.out.println("Array after quick sort:");
        for (T item : array) {
            System.out.println(item);
        }
        System.out.println("Number of comparison operations: " + comparisons);
    }

    private void quickSort(T[] array, int low, int high, Comparator<T> comparator, int comparisons) {
        if (low < high) {
            int partitionIndex = partition(array, low, high, comparator, comparisons);
            quickSort(array, low, partitionIndex - 1, comparator, comparisons);
            quickSort(array, partitionIndex + 1, high, comparator, comparisons);
        }
    }

    private int partition(T[] array, int low, int high, Comparator<T> comparator, int comparisons) {
        T pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) < 0) {
                i++;
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            comparisons++;
        }
        T temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
