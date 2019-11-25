package Medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> result = new ArrayList<>();

    void changeIt(int start, int[] nums) {
        for (int i = start; i < nums.length; i++) {

        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            changeIt(i, nums);
        }
        return result;
    }
}
