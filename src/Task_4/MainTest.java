package Task_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class MainTest {
    @Test
    void testSelectionSort() {
        String[] words = {"abcdefg", "word", "abc", "zx", "wordzx", "abcdefgZX", "wordZXSD", "zx"};
        String[] expected = {"abc", "abcdefg", "abcdefgZX", "word", "wordZXSD","wordzx","zx","zx"};

        SortAlg<String> selectionSort = new SelectionSort<>();
        selectionSort.sort(words, Comparator.naturalOrder());

        Assertions.assertArrayEquals(expected, words);
    }

    @Test
    void testQuickSort() {
        Integer[] numbers = {5, 2, 8, 1, 9};
        Integer[] expected = {1, 2, 5, 8, 9};

        SortAlg<Integer> quickSort = new QuickSort<>();
        quickSort.sort(numbers, Comparator.naturalOrder());

        Assertions.assertArrayEquals(expected, numbers);
    }
}
