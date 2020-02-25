package Contests.Contest157;

public class Q1SplitaStringinBalancedStrings {
    public int balancedStringSplit(String s) {
        int num = 0;
        char fs = s.charAt(0);
        int  fsnum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == fs) {
                fsnum++;
            } else {
                fsnum--;
            }
            if (fsnum == 0) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Q1SplitaStringinBalancedStrings a = new Q1SplitaStringinBalancedStrings();
        System.out.println(a.balancedStringSplit("LLLLRRRR"));
    }
}
