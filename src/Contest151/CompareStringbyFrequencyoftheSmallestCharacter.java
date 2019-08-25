package Contest151;

public class CompareStringbyFrequencyoftheSmallestCharacter {
    public int small(String k) {
        char m = k.charAt(0);
        for (char it : k.toCharArray()) {
            if (it < m) {
                m = it;
            }
        }
        int result = 0;
        for (char it : k.toCharArray()) {
            if (it == m) {
                result++;
            }
        }
        return result;
    }
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] result = new int[queries.length];
        for (int m = 0; m < queries.length; m++) {
            int i = 0;
            for (String word : words) {
                if (small(queries[m]) < small(word)) {
                    i++;
                }
            }
            result[m] = i;
        }
        return result;
    }
}
