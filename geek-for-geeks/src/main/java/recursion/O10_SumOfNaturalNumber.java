package recursion;

public class O10_SumOfNaturalNumber {

    public int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
