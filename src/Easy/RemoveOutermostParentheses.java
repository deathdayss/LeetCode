package Easy;

public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String S) {
        int length = S.length();
        String tar = "";
        boolean first = true;
        int state = 0;
        int origin = 0;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == '(') {
                if (first) {
                    first = false;
                    origin = i;
                }
                state++;
            }
            else {
                if (--state == 0) {
                    if (i - origin > 1) {
                        tar += S.substring(origin + 1, i);
                    }
                    first = true;
                }
            }
        }
        return  tar;
    }

    public static void main(String[] args) {
    }
}
