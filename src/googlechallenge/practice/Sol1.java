package googlechallenge.practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sol1 {
    public static int sumList(List<Integer> k) {
        int sum = 0;
        for (int m : k)
            sum += m;
        return sum;
    }
    public static void main(String[] args) throws java.lang.Exception{
        Scanner userIn = new Scanner(System.in);
        userIn.nextLine();
        userIn.nextLine();

        int state = 0;
        List<String[]> inputs = new LinkedList<>();
        List<String> kinds = new LinkedList<>();
        List<List<Integer>> prices = new LinkedList<>();
        int testCases = 1;

        while (true) {
//            System.out.println("Start loop " + state);
            String input = userIn.nextLine();
            if(state == 0) {
                state++;
            } else if (input.equals("")){
//                System.out.println("Over");
                state = 0;
                for (String[] pair : inputs) {
                    int k = kinds.indexOf(pair[0]);
                    if (k == -1) {
                        kinds.add(pair[0]);
                        Collections.sort(kinds, String.CASE_INSENSITIVE_ORDER);

//                        System.out.println(kinds);

                        int index = kinds.indexOf(pair[0]);
                        List<Integer> mine = new LinkedList<>();
                        mine.add(Integer.parseInt(pair[1]));
                        prices.add(index, mine);
                    } else {
                        prices.get(k).add(Integer.parseInt(pair[1]));
                    }
                }
                System.out.println("Case " + "#" + testCases++ + ":");
                for (int i = 0; i < prices.size(); i++) {
                    System.out.println(kinds.get(i) + " " + Collections.min(prices.get(i)) + " " + Collections.max(prices.get(i)) + " " + sumList(prices.get(i))/prices.get(i).size());
                }
                System.out.println();
                inputs.clear();
                kinds.clear();
                prices.clear();
            } else {
//                System.out.println("Add String");
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == ' ') {
                        String[] m = new String[2];
                        m[0] = input.substring(0, i);
                        m[1] = input.substring(i+1);
//                        System.out.println(m[0] + m[1]);
                        inputs.add(m);
                        break;
                    }
                }
            }
        }
    }
}
