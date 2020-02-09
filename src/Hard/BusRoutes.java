package Hard;

public class BusRoutes {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        int[] result = new int[routes.length];
        helper(routes, S, T, result);
        printInt(result);
        return findMin(result, 0);
    }

    public void printInt(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]);
            if (i < m.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public int findMin(int[] intA, int base) {
        int min = Integer.MAX_VALUE;
        for (int a : intA) {
            if (a != -1 && a != base && a < min) {
                min = a;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
    public void helper(int[][] routes, int S, int T, int[] result) {
        for (int i = 0; i < routes.length; i++) {
            if (routes[i] == null) {
                continue;
            }
            boolean findS = false;
            for (int stop : routes[i]) {
                if (stop == S) {
                    findS = true;
                    break;
                }
            }
            if (findS) {
                System.out.println("The route is "+ i);
                printInt(routes[i]);
                int[] k = routes[i];
                routes[i] = null;
                int[] probabilities = new int[k.length];
                boolean directAnswer = false;
                for (int d = 0; d < k.length; d++) {
                    if (k[d] == T) {
                        result[i]++;
                        directAnswer = true;
                        break;
                    } else {
                        int[] next = new int[result.length];
                        for (int h = 0; h < next.length; h++) {
                            next[h] = result[i] + 1;
                        }
                        helper(routes, k[d], T, next);
                        probabilities[d] = findMin(next, result[i] + 1);
                    }
                }
                if (directAnswer) {
                    break;
                }
                result[i] = findMin(probabilities, -1);
            }
        }
    }

    public static void main(String[] args) {
        BusRoutes a = new BusRoutes();
        System.out.println(a.numBusesToDestination(new int[][] {new int[] {1, 2 ,7}, new int[] {3, 6, 7}, new int[] {1, 6}}, 1, 6));
    }
}
