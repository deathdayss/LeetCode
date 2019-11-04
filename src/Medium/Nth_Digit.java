package Medium;

public class Nth_Digit {
    public int findNthDigit(int n) {
        int k = 1;
        while (n > 9 * Math.pow(10, k - 1) * k) {
            n -= 9 * Math.pow(10, k - 1) * k;
            k++;
        }
        System.out.println("k is " + k);
        System.out.println("n is " + n);
        System.out.println(n % k);
        System.out.println((int)Math.pow(10, k - 1) + (int)Math.ceil((double)n/k) - 1);
        return Character.getNumericValue(Integer.toString((int)Math.pow(10, k - 1) + (int)Math.ceil((double)n/k) - 1).charAt((n - 1) % k));
    }

    public static void main(String[] args) {
        Nth_Digit a = new Nth_Digit();
        System.out.println(a.findNthDigit(190));
    }
}
