package Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> mySolution = new ArrayList<>();
    public void helper(int remain, List<Integer> oneSituation, ArrayList<Integer> nums) {
        if(remain == 0) {
            mySolution.add(oneSituation);
        } else {
            for(int i = 0; i < remain; i++) {
                List<Integer> temp = new ArrayList<>(oneSituation);
                temp.add(nums.get(i));
                ArrayList<Integer> theSecond = new ArrayList<>(nums);
                theSecond.remove(i);
                helper(remain - 1, temp, theSecond);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> theList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            theList.add(nums[i]);
        }
        helper(nums.length, new ArrayList<>(), theList);
        return mySolution;
    }
}
