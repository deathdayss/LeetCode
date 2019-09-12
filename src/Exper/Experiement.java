package Exper;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import jdk.jfr.Experimental;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
        ArrayList<String> ms = new ArrayList<>();
        ms.add("asfw");
        HashMap<Integer, ArrayList<String>> myHash = new HashMap<>();
        myHash.put(1, ms);
        ArrayList<String> fs = myHash.get(1);
        fs = new ArrayList<>();
        fs.add("asd");
        myHash.put(1,fs);
        System.out.println(myHash.get(1).get(0));
    }
}
