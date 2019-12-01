package Contest165;

import java.util.ArrayList;
import java.util.List;

public class Number_of_Burgers_with_No_Waste_of_Ingredients {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        int mid = tomatoSlices - 2 * cheeseSlices;
        List<Integer> result = new ArrayList<>();
        if (mid % 2 != 0 || mid < 0) {
            return result;
        }
        int JB = mid / 2;
        int SB = cheeseSlices - JB;
        if (SB < 0) {
            return result;
        }
        result.add(JB);
        result.add(SB);
        return result;
    }
}
