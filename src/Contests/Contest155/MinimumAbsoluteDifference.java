package Contests.Contest155;

import java.util.*;
import java.util.stream.Collectors;

public class MinimumAbsoluteDifference {
    List<List<Integer>> result = new ArrayList<>();
    public void minDifference(int[] arr, int currentIndex, int minVar) {
        if (currentIndex == arr.length - 1) {
            return;
        } else {
            for (int i = currentIndex + 1; i < arr.length; i++) {
                int currentVar = Math.abs(arr[i] - arr[currentIndex]);
                if (currentVar <= minVar) {
                    if (currentVar < minVar) {
                        minVar = currentVar;
                        result.clear();
                    }
                    List<Integer> aPair = new ArrayList<>();
                    int first = Math.min(arr[i], arr[currentIndex]);
                    int second = Math.max(arr[i], arr[currentIndex]);
                    aPair.add(first);
                    aPair.add(second);
                    result.add(aPair);
                }
            }
            minDifference(arr, currentIndex + 1, minVar);
        }
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> myArr = Arrays.stream(arr).boxed().collect(Collectors.toList());
        minDifference(arr, 0, Integer.MAX_VALUE);
        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(1) <= o2.get(0)) {
                    return -1;
                } else if (o1.get(0) >= o2.get(1)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return result;
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifference ms = new MinimumAbsoluteDifference();
    }
}
