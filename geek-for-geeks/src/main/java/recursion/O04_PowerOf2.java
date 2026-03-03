package recursion;

public class O04_PowerOf2 {

    //redid - 3
    public int powerOf2(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prev = powerOf2(n / 2);
        return 2 * prev;
    }
}
