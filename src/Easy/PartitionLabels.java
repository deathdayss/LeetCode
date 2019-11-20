package Easy;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static List<Integer> partitionLabels(String S) {
        List<Integer> a = new ArrayList<Integer>();
        int count = 1;
        int g = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i - g < count) {
                if (i == S.length() - 1) {
                    a.add(count);
                    break;
                }
                for (int m = S.length() - 1; m >= 0; m--) {
                    if (m + 1 - g <= count) {
                        break;
                    }
                    if (S.charAt(i) == S.charAt(m)) {
                        count = m + 1 - g;
                        break;
                    }
                }
            }
            else {
                a.add(count);
                count = 1;
                g = i;
                i--;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(partitionLabels("aabbc").size());
    }
}
