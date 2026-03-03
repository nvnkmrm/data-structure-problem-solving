package bitwise;

/**
 * Count total set bit in all numbers from 1 to n
 */
public class O14_CountTotalSetBit {

    public int simpleSolution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                if ((num & 1) != 0) {
                    count++;
                }
                num >>= 1;
            }
        }
        return count;
    }

    public int verticalFashionSolution(int n) {
        int i = 0;
        int ans = 0;
        while ((1 << i) <= n) {
            int change = 1 << i;
            boolean isBitSetVertically = false;
            for (int j = 0; j <= n; j++) {
                if (isBitSetVertically) {
                    ans++;
                }
                if (change == 1) {
                    isBitSetVertically = !isBitSetVertically;
                    change = 1 << i;
                } else {
                    change--;
                }
            }
            i++;
        }
        return ans;
    }

    private int getLeftMostSetBitPosition(int n) {
        return (int) Math.floor(Math.log(n) / Math.log(2));
    }

    // redid - 2
    public int efficientSolution(int n) {
        int count = 0;
        int x = getLeftMostSetBitPosition(n);
        while (n > 0) {
            count += x * (1 << x) / 2 + n - (1 << x) + 1;
            n = n & (~(1 << x));
            x = getLeftMostSetBitPosition(n);
        }
        return count;
    }
}
