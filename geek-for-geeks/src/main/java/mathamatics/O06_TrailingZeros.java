package mathamatics;

/**
 * Trailing Zero of N! factorial
 */
public class O06_TrailingZeros {
    //Redid - 3
    public int getTrailingZeros(int n) {
        int count =0;
        for (int i=5;i<=n;i*=5) {
            count +=n/i;
        }
        return count;
    }
}
