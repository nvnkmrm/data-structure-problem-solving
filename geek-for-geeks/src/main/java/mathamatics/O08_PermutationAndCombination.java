package mathamatics;

public class O08_PermutationAndCombination {

    private final O07_FactorialOfNumber factorial;

    public O08_PermutationAndCombination() {
        factorial = new O07_FactorialOfNumber();
    }

    public int permutation(int n, int r) {
        return factorial.factorial(n) / factorial.factorial(n - r);
    }

    public int combination(int n, int r) {
        return factorial.factorial(n) / (factorial.factorial(r) * factorial.factorial(n - r));
    }

}
