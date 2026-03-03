package mathamatics;

public class O07_FactorialOfNumber {

    //Redid - 1
    public int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public int tailRecursionFactorial(int n) {
        return tailRecursionFactorial(n, 1);
    }

    public int tailRecursionFactorial(int n, int result) {
        if (n == 0) {
            return result;
        }
        return tailRecursionFactorial(n - 1, n * result);
    }

}
