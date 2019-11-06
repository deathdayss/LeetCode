package Exper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Experiement{

    public int[][][] findIt(int[][] tuple, int start) {
        for (int i = start; i < tuple.length; i++) {
            return null;
        }
        return null;
    }
    public int[][][] findCircle(int[][] tuple) {

        return findIt(tuple, 0);
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(4);
        a.add(1);
        a.add(9);
        a.add(1);
        a.add(1);
        System.out.println(x(a));
    }
    static List<Integer> x(List<Integer> in) {
        if (in == null || in.size() <= 1)
            return in;

        int size = in.size();
        List<Integer> l = x(in.subList(0, size/2));
        List<Integer> r = x(in.subList(size/2, size));

        int lf = 0;
        int rf = 0;
        List<Integer> result = new ArrayList<>(size);

        while (lf < l.size() || rf < r.size()) {
            if (lf == l.size() || (rf < r.size() && r.get(rf) < l.get(lf))) {
                result.add(r.get(rf++));
            } else {
                result.add(l.get(lf++));
            }
        }
        return result;
    }
}
