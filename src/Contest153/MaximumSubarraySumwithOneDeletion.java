package Contest153;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumSubarraySumwithOneDeletion {
    ArrayList<Integer> result = new ArrayList<>();
    ArrayList<Integer> sum = new ArrayList<>();
    public void getResult(int m, int n) {
        if (n == sum.size() + 1) {
            m += 1;
            n = m + 1;
        }
        if (m == sum.size()) {
            return;
        }
        int theNum = 0;
        int minN = 0;
        //System.out.println("m = " + m);
        //System.out.println("n = " + n);
        for (int i = m; i < n; i++) {
            theNum += sum.get(i);
            if (sum.get(i) <= minN) {
                minN = sum.get(i);
            }
        }
        if (n - m > 1) {
            theNum -= minN;
        }
        result.add(theNum);
        getResult(m, n + 1);
    }
    public int maximumSum(int[] arr) {
        int sumP = 0;
        int countP = 0;
        int countN = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                if (countN != 0) {
                    countN = 0;
                }
                countP++;
                sumP += arr[i];
            } else if(arr[i] < 0) {
                if (countN == 0 && countP > 0) {
                    sum.add(sumP);
                    countP = 0;
                }
                sum.add(arr[i]);
                countN++;
                sumP = 0;
            }
            if (i == arr.length - 1 && arr[i] >= 0) {
                sum.add(sumP);
            }
        }
        //System.out.println(sum.size());
        getResult(0, 1);
        return Collections.max(result);
    }

    public static void main(String[] args) {
        MaximumSubarraySumwithOneDeletion xs = new MaximumSubarraySumwithOneDeletion();
        System.out.println((xs.maximumSum(new int[] {}))
    }
}
