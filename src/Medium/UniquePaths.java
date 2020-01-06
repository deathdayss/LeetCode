package Medium;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class UniquePaths {
    int result;
    public int uniquePaths(int m, int n) {
        helper(0,0,m,n);
        return result;
    }

    public void helper(int x, int y, int m, int n) {
        if (x == m - 1 && y == n - 1) {
            result++;
        }
        int t = 0;
        if (x + 1 < m) {
            helper(x + 1, y, m, n);
        }
        if (y + 1 < n) {
            helper(x, y + 1, m, n);
        }
    }

    public static void main(String[] args) {
        Random a = new Random();
        List<Integer> k = new LinkedList<>();
        int find = 0;
        while (k.size() != 50) {
            for (int i = 1; i <= 100; i++) {
                find++;
                if (k.size() == 50) {
                    break;
                }
                if (!k.contains(i) && a.nextInt(2) == 1) {
                    k.add(i);
                }
            }
        }
        Collections.sort(k);
        System.out.println(k);
        System.out.println(find);
        System.out.println("separator");
        String f = "asd";
        List m = new LinkedList();
        m.add(f);
        m.add(f);
        m.add(f);
        System.out.println(m);
    }
}
