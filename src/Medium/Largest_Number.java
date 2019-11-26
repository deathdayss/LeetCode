package Medium;

import java.util.ArrayList;
import java.util.List;

public class Largest_Number {
    public String largestNumber(int[] nums) {
        String target = "";
        String[] sNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sNums[i] = Integer.toString(nums[i]);
        }
        for(int i = 0; i < nums.length; i++) {
            int maxStart = Integer.MIN_VALUE;
            int tarIndex = 0;
            String addIt = "";
            List<String> equal = new ArrayList<>();
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] != -1) {
                    int var = Character.getNumericValue(sNums[k].charAt(0));
                    if (var > maxStart) {
                        tarIndex = k;
                        equal.clear();
                        equal.add(sNums[k].substring(1));
                        addIt = sNums[k].substring(0, 1);
                    }
                    if (var == maxStart) {
                        equal.add(sNums[k].substring(1));
                    }
                }
            }
            target += addIt;
            if (equal.size() == 1) {
                target += equal.get(0);
                nums[tarIndex] = -1;
            } else {
                
            }
        }
    }
}
