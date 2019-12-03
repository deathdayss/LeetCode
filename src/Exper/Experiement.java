package Exper;

import java.io.IOException;
import java.util.ArrayList;
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

    }
    public static void main(String[] args) {
        String k = "abb";
        String c = "abb";

        ai a = new Sit();
        ((Sit)a).getIt();
    }
}
