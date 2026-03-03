package mathamatics;

public class O13_IterativePower {

    //redid - 2
    public int pow(int x, int n) {
        int res = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                res = res * x;
            }
            x = x * x;
            n = n >> 1;
        }
        return res;
    }

    public long modularExponentiation(long x, int n, long m) {
        long res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = modularMultiplicative(res, x, m);
            }
            x = modularMultiplicative(x, x, m);
            n = n / 2;
        }
        return res;
    }

    public long modularMultiplicative(long a, long b, long m) {
        return ((a % m) * (b % m)) % m;
    }
}
