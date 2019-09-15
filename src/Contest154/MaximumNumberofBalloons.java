package Contest154;

public class MaximumNumberofBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] target = new int[5];
        for (char unit : text.toCharArray()) {
            if (unit == 'b') {
                target[2]++;
            } else if (unit == 'a') {
                target[3]++;
            } else if (unit == 'l') {
                target[0]++;
            } else if (unit == 'o') {
                target[1]++;
            } else if (unit == 'n') {
                target[4]++;
            }
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < target.length; i++) {
            if (i == 0 || i == 1) {
                result = Math.min(result, target[i]/2);
            } else {
                result = Math.min(result, target[i]);
            }
        }
        return result;
    }
}
