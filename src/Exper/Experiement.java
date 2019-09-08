package Exper;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import jdk.jfr.Experimental;

import java.util.ArrayList;

interface as {
    int sd = 2;
    void killit();
}
class it {
    int num = 0;
    public void printIt() {
        System.out.println(num);
    }
    int other() {
        return 5;
    }
    int ui() {
        return 43;
    }
}
class Experiement extends it {
    static int[] m = {1,23,4};
    int num = 23;
    @Override
    public void printIt(){
        super.printIt();
        System.out.println(super.num);
    }
    public static void add(int[] j) {
        j[0] += 1;
    }
    public static void main(String[] args) {
        int[] h = m.clone();
        h[0] = 2;
        ArrayList<String> m = new ArrayList<>();
        String k = "asd";
        m.add(k);
        String p = "asd";
        int[] m1 = new int[1];
        m1[0] = 1;
        add(m1);
        Experiement asd = new Experiement();
        asd.printIt();
    }
}
