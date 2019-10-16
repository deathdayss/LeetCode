package Easy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] object = new int[arr1.length];
        int k = 0;
        for(int m = 0; m < arr2.length; m++) {
            for (int n = 0; n < arr1.length; n++) {
                if (arr2[m] == arr1[n]) {
                    object[k] = arr1[n];
                    k++;
                }
            }
        }
        ArrayList<Integer> it = new ArrayList<>();
        for(int m = 0; m < arr1.length; m++) {
            boolean t = false;
            for (int n = 0; n < arr2.length; n++) {
                if (arr1[m] == arr2[n]) {
                    t = true;
                    break;
                }
            }
            if (!t) {
                it.add(arr1[m]);
            }
        }
        Collections.sort(it);
        System.out.println(it);
        int h = 0;
        for(int j = k; j < object.length; j++) {
            object[j] = it.get(h);
            h++;
        }
        return object;
    }
}
