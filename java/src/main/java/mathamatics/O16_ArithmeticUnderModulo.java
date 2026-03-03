package mathamatics;

public class O16_ArithmeticUnderModulo {

    public long sum(long a, long b) {
        long m = 1000000007;
        return ((a % m) + (b % m)) % m;
    }

    public long multiply(long a, long b) {
        long m = 1000000007;
        return ((a % m) * (b % m)) % m;
    }
}
