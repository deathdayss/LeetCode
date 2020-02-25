package Contests.Contest152;

public class DietPlanPerformance {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int total = 0;
        for(int m = 0; m < calories.length; m += k) {
            int calory = 0;
            if(m + k > calories.length) {
                break;
            }
            for(int j = m; j < m + k; j++) {
                calory += calories[j];
            }
            if(calory > upper) {
                total += 1;
            } else if (calory < lower) {
                total -= 1;
            }
        }
        return total;
    }
}
