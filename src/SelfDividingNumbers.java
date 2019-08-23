import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> target = new ArrayList<>();
        for (int a = left; a <= right; a++) {
            boolean t = true;
            for(char it : Integer.toString(a).toCharArray()) {
                if(it == '0' || a % (it - '0') != 0) {
                    t = false;
                    break;
                }
            }
            if (t) {
                target.add(a);
            }
        }
        return target;
    }
}
