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
    public static int[] add(int[] j) {
        j[0] = 1;
        return j;
    }
    public static String sortIt(String placement) {
        String m = "";
        ArrayList<Integer> myIntegers = new ArrayList<>();
        ArrayList<Character> myChars = new ArrayList<>();
        for (int i = 0; i < placement.length(); i += 4) {
            if (myChars.size() == 0) {
                myChars.add(placement.charAt(i));
                myIntegers.add(i);
            } else {
                if (placement.charAt(i) <= myChars.get(0)) {
                    myChars.add(0, placement.charAt(i));
                    myIntegers.add(0, i);
                } else if (placement.charAt(i) >= myChars.get(myChars.size() - 1)) {
                    myChars.add(placement.charAt(i));
                    myIntegers.add(i);
                } else {
                    for (int index = 0; index < myChars.size(); index++) {
                        if(placement.charAt(i) > myChars.get(index) && placement.charAt(i) < myChars.get(index + 1)) {
                            myChars.add(index + 1, placement.charAt(i));
                            myIntegers.add(index + 1, i);
                            break;
                        }
                    }
                }
            }
        }
        for(Integer real : myIntegers) {
            m += placement.substring(real, real + 4);
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(sortIt("h000a021d232i532e621g220j701b410c100f400"));
    }
}
