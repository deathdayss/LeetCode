import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static List<Integer> partitionLabels(String S) {
        List<Integer> a = new ArrayList<Integer>();
        ArrayList<Character> b = new ArrayList<Character>();
        int count = 1;
        int g = 0;
        for (int i = 0; i < S.length(); i++) {
            if (a.size() != 0)
                g = a.get(a.size() - 1);
            if (b.contains(S.charAt(i))) {
                continue;
            }
            if (i - g < count) {
                for (int m = S.length() - 1; m >= 0; m--) {
                    if (m + 1 - g <= count) {
                        break;
                    }
                    if (S.charAt(i) == S.charAt(m)) {
                        count = m + 1 - g;
                        break;
                    }
                }
                b.add(S.charAt(i));
            }
            else {
                a.add(count);
                count = 1;
                b.clear();
                if (i < S.length() - 1)
                    i--;
                else
                    a.add(count);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(partitionLabels("abce").get(0));
    }
}
