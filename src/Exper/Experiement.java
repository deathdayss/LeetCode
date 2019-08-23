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
    void killit();
}

class Experiement {
    static int a = 23;
    void it() {
        int i = 2;
    }
    int ui() {
        a = 2324;
        return a;
    }
    public static void main(String[] args) {
        // launch(args);
        Experiement as = new Experiement();
        System.out.println(as.a);
        System.out.println("a");
        ArrayList<Integer> a = new ArrayList<>();
        a.forEach(b ->
                System.out.println(b + 1));
    }
}
