package Contest154;

import java.util.ArrayList;

public class ReverseSubstringsBetweenEachPairofParentheses {
    public String reverseParentheses(String s) {
        ArrayList<Integer> former = new ArrayList<>();
        ArrayList<Integer[]> intervals = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                former.add(i);
            } else if (s.charAt(i) == ')') {
                Integer[] interval = new Integer[2];
                interval[0] = former.get(former.size() - 1);
                former.remove(former.size() - 1);
                interval[1] = i;
                intervals.add(interval);
            }
        }
        for (Integer[] interval : intervals) {
            String reversed = Reverse(s.substring(interval[0] + 1, interval[1]));
            s = s.substring(0, interval[0] + 1) + reversed + s.substring(interval[1]);
        }
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        return s;
    }
    String Reverse(String obt) {
        String h = "";
        for (int i = obt.length() - 1; i >= 0; i--) {
            h += obt.charAt(i);
        }
        return h;
    }

    public static void main(String[] args) {
        ReverseSubstringsBetweenEachPairofParentheses ms = new ReverseSubstringsBetweenEachPairofParentheses();
        System.out.println(ms.reverseParentheses("a(bcdefghijkl(mno)p)q"));
        boolean[] k = new boolean[1];
        ArrayList<String> test = new ArrayList<>();
        test.add("your");
        test.add("mine");
        test.add(1, "is");
        System.out.println(test);
    }
}
