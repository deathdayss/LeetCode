package Easy;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int a = 0;
        int b = 0;
        for (char m : moves.toCharArray()) {
            if (m == 'U')
                a++;
            else if (m == 'D')
                a--;
            else if (m == 'R')
                b++;
            else
                b--;
        }
        if (a == 0 && b == 0)
            return true;
        else
            return false;
    }
}
