package Medium;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        helper("",0, digits);
        return result;
    }
    public void helper(String acc, int index, String digits) {
        if (index == digits.length()) {
            if (!acc.equals("")) {
                result.add(acc);
            }
            return;
        }
        int d = digits.charAt(index);
        int k;
        int add = 2;
        if (d <= 54) {
            k = 3 * (d - 50) + 97;
        } else if (d == 55) {
            k = 112;
            add = 3;
        } else if (d == 56) {
            k = 116;
        } else {
            k = 119;
            add = 3;
        }
        for (int i = k; i <= k + add; i++) {
            helper(acc + (char)i, index + 1, digits);
        }
    }

    public static void main(String[] args) {
        Letter_Combinations_of_a_Phone_Number a = new Letter_Combinations_of_a_Phone_Number();
        System.out.println(a.letterCombinations("7"));
    }
}
