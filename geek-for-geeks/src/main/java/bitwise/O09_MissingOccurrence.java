package bitwise;

/**
 * Missing occurrence in 1 to n+1 sequence
 * {1,4,3} here 2 is missing
 * {1,3,5,2} here 4 is missing
 */
public class O09_MissingOccurrence {

    public int findMissingOccurrence(int[] a) {
        int xorOfSeq = 0;
        int xorOfArr = 0;
        int n = a.length;
        for (int i = 1; i <= n + 1; i++) {
            xorOfSeq ^= i;
            if (i <= n) {
                xorOfArr ^= a[i-1];
            }
        }
        return xorOfArr ^ xorOfSeq;
    }
}
