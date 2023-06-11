package Task_1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];
        String[] words = Arrays.copyOfRange(args, 2, args.length);

        System.out.println("Array:");
        printArray(words);

        sortBySubstring(words, s1, s2);
        System.out.println("First sort:");
        printArray(words);

        sortByLowerCaseCount(words);
        System.out.println("Second sort:");
        printArray(words);
    }

    public static void sortBySubstring(String[] words, String s1, String s2) {
        Arrays.sort(words, Comparator.comparing(word -> {
            int start = word.indexOf(s1);
            int end = word.lastIndexOf(s2);
            if (start >= 0 && end >= 0 && start < end) {
                return word.substring(start, end + s2.length());
            }
            return word;
        }));
    }

    public static void sortByLowerCaseCount(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(Main::countLowerCaseLetters));
    }

    public static int countLowerCaseLetters(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count++;
            }
        }
        return count;
    }

    private static void printArray(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Count: " + (words.length * (words.length - 1) / 2));
        System.out.println();
    }
}
