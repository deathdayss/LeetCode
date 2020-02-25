package Contests.Contest152;

public class PrimeArrangements {
    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if(n == 2) {
            return true;
        }
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int numPrimeArrangements(int n) {
        int prime = 0;
        int noPrime = 0;
        for(int k = 1; k <= n; k++) {
            if (isPrime(k)) {
                System.out.println(k + "is prime");
                prime++;
            } else {
                System.out.println(k + "is noPrime");
                noPrime++;
            }
        }
        int result = 1;
        for(int h = 2; h <= prime; h++) {
            result %= (int)Math.pow(10, 9) + 7;
            result *= h;
            System.out.println(result);
        }
        System.out.println(result);
        for (int h = 2; h <= noPrime; h++) {
            result %= (int)Math.pow(10, 9) + 7;
            result *= h;
            System.out.println(result);
        }
        return result % ((int)Math.pow(10, 9) + 7);
    }
}
