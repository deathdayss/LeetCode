package Easy;

import java.util.ArrayList;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int it : A) {
            if (it % 2 == 0) {
                even.add(it);
            } else
                odd.add(it);
        }
        even.addAll(odd);
        int[] ob = new int[even.size()];
        for (int i = 0; i < even.size(); i++) {
            ob[i] = even.get(i);
        }
        return ob;
    }
}
