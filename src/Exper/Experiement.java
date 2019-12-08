package Exper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ai {

    void output1() {
        System.out.println("asd");
    }
}

class ml extends ai {
    @Override
    void output1() {
        System.out.println("has been overrode");
    }
}

class Sit extends ml {
    @Override
    void output1() {
        System.out.println("The 2nd override");
    }

    void getIt() {
        System.out.println("get it");
    }
}


class Experiement{

    static String d = "abc";
    public int[][][] findIt(int[][] tuple, int start) {
        for (int i = start; i < tuple.length; i++) {
            return null;
        }
        return null;
    }
    public int[][][] findCircle(int[][] tuple) {

        return findIt(tuple, 0);
    }

    static void changeString (String a) {
        a = d;
        String g = new String("abc");
        System.out.println(a.equals(g));
    }
    public static void main(String[] args) {
        String k = "abb";
        String c = new String("abc");
        System.out.println(new Date());
        changeString("asdc");
    }
}
