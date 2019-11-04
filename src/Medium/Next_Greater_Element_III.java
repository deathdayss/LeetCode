package Medium;

import java.util.Arrays;

public class Next_Greater_Element_III {

    public String getIt(String original, String sorted, int depth, String result) {
        System.out.println("depth is " + depth);
        System.out.println("sorted is " + sorted);
        if (original.length() > depth) {
            for (int i = 0; i < sorted.length(); i++) {
                if (original.charAt(depth) == sorted.charAt(i) && depth < original.length() - 1 || original.charAt(depth) < sorted.charAt(i) && depth == original.length() - 1) {
                    System.out.println("current index is " + i);
                    String maybeResult = getIt(original, sorted.substring(0, i) + sorted.substring(i + 1), depth + 1, result + sorted.charAt(i));
                    if (maybeResult != "-1") {
                        return maybeResult;
                    }
                } else if (original.charAt(depth) < sorted.charAt(i)) {
                    return result + sorted.charAt(i) + sorted.substring(0, i) + sorted.substring(i + 1);
                }
            }
            return "-1";
        } else {
            return result;
        }
    }

    public int nextGreaterElement(int n) {
        String myChar = Integer.toString(n);
        char[] sorteds = myChar.toCharArray();
        Arrays.sort(sorteds);
        String sorted = new String(sorteds);
        try {
            return Integer.parseInt(getIt(myChar, sorted, 0, ""));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        Next_Greater_Element_III a = new Next_Greater_Element_III();
        System.out.println(a.nextGreaterElement(1999999999));
    }
}
