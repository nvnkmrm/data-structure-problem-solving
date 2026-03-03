package recursion;

public class O03_NthFibonacciNumber {

    //redid -2

    /**
     * Finding nth fibonacci number
     *
     * @param n
     * @return
     */
    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Finding nth fibonacci number using memoization technique
     *
     * @param n
     * @param memo
     * @return
     */
    public int fibonacci(int n, int[] memo) {
        System.out.println(n);
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] > 0) {
            return memo[n];
        }
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }

    /**
     * Finding nth fibonacci number using memoization technique
     *
     * @param n
     * @return
     */
    public int fibWithMemo(int n) {

        int[] memo = new int[n + 1];
        return fibonacci(n, memo);
    }

}
