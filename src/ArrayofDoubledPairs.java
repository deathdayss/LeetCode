import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayofDoubledPairs {
    public boolean canReorderDoubled(int[] A) {
        /*ArrayList<Integer> pInteger = new ArrayList<>();
        ArrayList<Integer> ninteger = new ArrayList<>();*/
        /*for (int i : A) {
            if (i >= 0) {
                if (pInteger.size() == 0) {
                    pInteger.add(i);
                } else if (pInteger.size() == 1){
                    if (i < pInteger.get(0)) {
                        pInteger.add(0, i);
                    } else {
                        pInteger.add(i);
                    }
                } else {
                    if (i <= pInteger.get(0)) {
                        pInteger.add(0,i);
                    } else if (i >= pInteger.get(pInteger.size() - 1)) {
                        pInteger.add(i);
                    } else {
                        for (int m = 0; m < pInteger.size(); m++) {
                            if (i >= pInteger.get(m) && i <= pInteger.get(m + 1)) {
                                pInteger.add(m + 1, i);
                                break;
                            }
                        }
                    }
                }
            } else {
                if (ninteger.size() == 0) {
                    ninteger.add(i);
                } else if (ninteger.size() == 1){
                    if (i > ninteger.get(0)) {
                        ninteger.add(0, i);
                    } else {
                        ninteger.add(i);
                    }
                } else {
                    if (i >= ninteger.get(0)) {
                        ninteger.add(0,i);
                    } else if (i <= ninteger.get(ninteger.size() - 1)) {
                        ninteger.add(i);
                    } else {
                        for (int m = 0; m < ninteger.size(); m++) {
                            if (i <= ninteger.get(m) && i >= ninteger.get(m + 1)) {
                                ninteger.add(m + 1, i);
                                break;
                            }
                        }
                    }
                }
            }
        }*/
        ArrayList<Integer> myInteger = new ArrayList<>();
        for (int m : A) {
            myInteger.add(m);
        }
        Collections.sort(myInteger);
        /*System.out.println(ninteger);
        ninteger.addAll(pInteger);
        System.out.println(ninteger);
        for (int i = 0; i < ninteger.size(); i++) {
            boolean isValid = false;
            int twice = 0;
            for (int w = i + 1; w < ninteger.size(); w++) {
                 if (ninteger.get(w) == 2 * ninteger.get(i)) {
                     isValid = true;
                     twice = w;
                     break;
                 }
            }
            if (isValid) {
                ninteger.remove(twice);
                ninteger.remove(i);
                i--;
            } else {
                return false;
            }
        }*/
        for (int i = 0; i < myInteger.size(); i++) {
            boolean isValid = false;
            int twice = 0;
            for (int w = i + 1; w < myInteger.size(); w++) {
                if (myInteger.get(i) >= 0) {
                    if (myInteger.get(w) == 2 * myInteger.get(i)) {
                        isValid = true;
                        twice = w;
                        break;
                    }
                } else {
                    if (myInteger.get(w) * 2 == myInteger.get(i)) {
                        isValid = true;
                        twice = w;
                        break;
                    }
                }
            }
            if (isValid) {
                myInteger.remove(twice);
                myInteger.remove(i);
                i--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayofDoubledPairs ad = new ArrayofDoubledPairs();
        System.out.println(ad.canReorderDoubled(new int[]{-2,-6,-3,4,-4,2}));
    }
}
