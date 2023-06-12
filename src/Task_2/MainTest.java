package Task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testSortBySubstring() {
        String words = "Lorem Ipsum{} is simply dummy text of the prin{}ting and typesetting industry.";
        String expected = "Lorem Ipsum{1} is simply dummy text of the prin{0}ting and typesetting industry.";
        assertEquals(expected,Main.transform(words));

    }
}
