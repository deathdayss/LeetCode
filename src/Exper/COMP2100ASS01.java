package Exper;

public class COMP2100ASS01 {
    static int useMod(int lab, int assignment1, int assignment2,
                      int finalexam) {
        int m = (assignment1 * 150 + assignment2 * 150 + lab * 100 + finalexam * 60);
        int raw = ((m % 100 < 50) ? (m / 100) : (m / 100) + 1);
        return raw;

    }
    static int dnum(int lab, int assignment1, int assignment2,
                    int finalexam) {
        int raw = (int) Math.round(((assignment1 / 10.0f) * 0.15f + (assignment2 / 10.0f)
                * 0.15f + (lab / 10.0f) * 0.1f + (finalexam / 100.0f) * 0.6f) * 100.0f);
        return raw;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
            for (int j = 0; j <= 10; j++)
                for (int h = 0; h <= 10; h++)
                    for (int l = 0; l <= 100; l++) {
                        if (useMod(i,j,h,l) != dnum(i,j,h,l)) {
                            System.out.println("i: " + i + ", j: " + j + ", h: " + h + ", l: " + l);
                            System.out.println("useMod: " + useMod(i,j,h,l) );
                            System.out.println("dnum: " + dnum(i,j,h,l));
                        }
                    }
    }
}
