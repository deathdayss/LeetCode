package Easy;

public class SpiralMatrixIII {
    int index = 1;
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int num = R * C;
        int[][] object = new int[num][2];
        int l = 1;
        int dirct = 0;
        int[] place = new int[2];
        place[0] = r0;
        place[1] = c0;
        object[0] = new int[] {r0, c0};
        while (index < num) {
            int[] last = place.clone();
            int dirction = dirct % 4;
            if (dirction == 0) {
                place[1] += l;
                addIt(last, place, object, true, R, C);
            } else if (dirction == 1) {
                System.out.println("direction is " + dirct);
                place[0] += l;
                l++;
                addIt(last, place, object, true, R, C);
            } else if (dirction == 2) {
                place[1] -= l;
                addIt(last, place, object, false, R, C);
            } else {
                place[0] -= l;
                l++;
                addIt(last, place, object, false, R, C);
            }
            System.out.println(dirct + "row is " + place[0]);
            System.out.println(dirct + "col is " + place[1]);
            dirct++;
        }
        return object;
    }
    void addIt(int[] last, int[] place, int[][] object, boolean t, int R, int C) {
        if (last[0] == place[0]) {
            if (last[0] < 0 || last[0] >= R) {
                return;
            }
            System.out.println("walk on row");
            if (t) {
                for (int c = last[1] + 1; c <= place[1]; c++) {
                    if (c >= 0 && c < C) {
                        object[index] = new int[] {last[0], c};
                        System.out.println("add " + "[" + last[0] + ", " + c + "]");
                        index++;
                    }
                }
            } else {
                for (int c = last[1] - 1; c >= place[1]; c--) {
                    if (c >= 0 && c < C) {
                        object[index] = new int[] {last[0], c};
                        System.out.println("add " + "[" + last[0] + ", " + c + "]");
                        index++;
                    }
                }
            }
        } else {
            System.out.println("walk on col");
            if (last[1] < 0 || last[1] >= C) {
                return;
            }
            if (t) {
                System.out.println("+");
                System.out.println("last is [" + last[0] + ", "+ last[1] + "]");
                System.out.println("current is [" + place[0] + ", " + place[1] + "]");
                for (int c = last[0] + 1; c <= place[0]; c++) {
                    if (c >= 0 && c < R) {
                        object[index] = new int[] {c, last[1]};
                        index++;
                        System.out.println("add " + "[" + c + ", " + last[1] + "]");
                    }
                }
            } else {
                for (int c = last[0] - 1; c >= place[0]; c--) {
                    if (c >= 0 && c < R) {
                        object[index] = new int[] {c, last[1]};
                        System.out.println("add " + "[" + c + ", " + last[1] + "]");
                        index++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        SpiralMatrixIII ms = new SpiralMatrixIII();
        int[][] gs = ms.spiralMatrixIII(1, 4, 0,0);
        for (int y = 0; y < gs.length; y++) {
            System.out.println(y + "row is " + gs[y][0]);
            System.out.println(y + "col is " + gs[y][1]);
        }
    }
}
