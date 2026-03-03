package mathamatics;

public class O02_PrimeNumber {

    public boolean isPrimeNumber(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    //Redid - 3
    public boolean isPrimeNumberMoreEfficient(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
