package Task_2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s1 = "Lorem Ipsum{} is simply dummy text of the prin{}ting and typesetting industry.\nLorem Ipsum has b{}een the industry's standard dummy {}text ever since the 1500{}s, \n when an unknown printer took a {}alley of type and scrambled it to make a type specimen book. \n It has survived no{}t only five centuries, b{}ut also the leap into electronic{} typesetting,\n {}remaining essentially unchanged.";
        String s2 = transform(s1);
        System.out.println("Transformed string: " + s2);
    }

    private static String transform(String input) {
        StringBuilder sb = new StringBuilder(input);
        int count = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '}') {
                sb.insert(i, count);
                count++;
            }
        }

        return sb.toString();
    }
}
