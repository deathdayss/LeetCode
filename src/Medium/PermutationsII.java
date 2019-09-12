package Medium;

import java.util.ArrayList;
import java.util.List;

public class PermutationsII {
    List<List<Integer>> mySolution = new ArrayList<>();
    public void helper(int remain, List<Integer> oneSituation, ArrayList<Integer> nums) {
        if(remain == 0) {
            mySolution.add(oneSituation);
        } else {
            ArrayList<Integer> guard = new ArrayList<>();
            for(int i = 0; i < remain; i++) {
                if (guard.contains(nums.get(i))) {
                    continue;
                }
                guard.add(nums.get(i));
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

    public static void main(String[] args) {
        PermutationsII mys = new PermutationsII();
        System.out.println(mys.permute(new int[]{1,1,2}));
    }
}
