package Medium;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    List<String> result = new ArrayList<>();
    String[] data = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

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
        String tar = data[digits.charAt(index) - 50];
        for (char i : tar.toCharArray()) {
            helper(acc + i, index + 1, digits);
        }
    }

    public static void main(String[] args) {
        Letter_Combinations_of_a_Phone_Number a = new Letter_Combinations_of_a_Phone_Number();
        System.out.println(a.letterCombinations("7"));
    }
}
