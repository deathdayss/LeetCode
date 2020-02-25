package Contests.Contest157;

public class Q3DiceRollSimulation {
    public int die(int n, int[] rollMax, int[] rollTimes, int result) {
        if (n == 0) {
            return result;
        }
        return result;
    }
    public int dieSimulator(int n, int[] rollMax) {
        int result = 6;
        int[] rollTimes = new int[] {1,1,1,1,1,1};
        return die(n - 1, rollMax, rollTimes, result);
    }
}
