package Exper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

interface Func{
    void operation(int x, int y);

}
class Experiement{
    int a = 0;
    void changeA() {
        Func a = (int x, int y) -> System.out.println(x + y);
    }


    public static void main(String[] args) {
        Experiement a = new Experiement();
        var inc = x -> x + 1;
    }
}
