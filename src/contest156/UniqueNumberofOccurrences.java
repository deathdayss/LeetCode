package contest156;

import java.util.ArrayList;

public class UniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> arrNum = new ArrayList();
        ArrayList<Integer> num = new ArrayList();
        for (int i : arr) {
            int index = arrNum.indexOf(i);
            if (index >= 0) {
                num.set(index, num.get(index) + 1);
            } else {
                arrNum.add(i);
                num.add(1);
            }
        }
        for (int i = 0; i < num.size(); i++) {
            for (int m = i + 1; m < num.size(); m++) {
                if (num.get(i).equals(num.get(m))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueNumberofOccurrences ms = new UniqueNumberofOccurrences();
        System.out.println(ms.uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
    }
}
