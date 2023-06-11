package Task_4;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        String[] words = args;

        System.out.println("Array: ");
        for (String word : words) {
            System.out.println(word);
        }

        SortAlg<String> selectionSort = new SelectionSort<>();
        selectionSort.sort(words.clone(), Comparator.naturalOrder());
        System.out.println();

        SortAlg<String> quickSort = new QuickSort<>();
        quickSort.sort(words.clone(), Comparator.naturalOrder());

    }
}