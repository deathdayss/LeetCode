package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group_Anagrams {

    boolean inTemplates(String tem, String tar) {
        if (tem.length() != tar.length()) {
            return false;
        }
        char[] t = tar.toCharArray();
        Arrays.sort(t);
        char[] t1 = tem.toCharArray();
        Arrays.sort(t1);
        for (int i = 0; i < t.length; i++) {
            if (t[i] != t1[i]) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for (String s : strs) {
            boolean noExist = true;
            for (List<String> kinds : result) {
                for (String tar : kinds) {
                    if (inTemplates(tar, s)) {
                        kinds.add(s);
                        noExist = false;
                        break;
                    }
                }
                if (!noExist) {
                    break;
                }
            }
            if (noExist) {
                List<String> kinds = new ArrayList<>();
                kinds.add(s);
                result.add(kinds);
            }
        }
        return result;
    }
}
