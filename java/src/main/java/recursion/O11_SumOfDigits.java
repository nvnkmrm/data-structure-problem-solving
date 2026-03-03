package recursion;

public class O11_SumOfDigits {

    //redid - 3
    public int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }
}
