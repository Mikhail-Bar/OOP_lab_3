package Task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testSortBySubstring() {
        String[] words = {"abcdefg", "word", "abc", "zx", "wordzx", "abcdefgZX", "wordZXSD", "zx"};
        Main.sortBySubstring(words, "a", "c");
        String[] expected = {"abcdefg", "abc", "abcdefgZX", "word", "wordZXSD", "wordzx", "zx", "zx"};
        assertArrayEquals(expected, words);

    }

    @Test
    public void testSortByLowerCaseCount() {
        String[] words = {"abcdefg", "abc", "abcdefgZX", "word", "wordZXSD", "wordzx", "zx", "zx"};
        Main.sortByLowerCaseCount(words);

        String[] expected = {"zx", "zx","abc", "word", "wordZXSD", "wordzx", "abcdefg", "abcdefgZX"};
        assertArrayEquals(expected, words);

    }

    @Test
    public void testCountLowerCaseLetters() {
        int count1 = Main.countLowerCaseLetters("abcdefgZX");
        assertEquals(7, count1);

        int count2 = Main.countLowerCaseLetters("wordZXSD");
        assertEquals(4, count2);

        int count3 = Main.countLowerCaseLetters("ZXC");
        assertEquals(0, count3);
    }
}
