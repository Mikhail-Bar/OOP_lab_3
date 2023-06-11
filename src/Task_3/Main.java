package Task_3;

import by.vsu.mf.ai.ssd.strings.Job;
import by.vsu.mf.ai.ssd.strings.Manager;

public class Main {
    public static void main(String[] args) {
        Manager.createWindow(new Job() {
            @Override
            public void perform(StringBuilder str) {
                int count = 0;
                for (int i = str.length() - 1; i >= 0; i--) {
                    if (str.charAt(i) == '}') {
                        str.insert(i, count);
                        count++;
                    }
                }
            }
        });
    }
}
