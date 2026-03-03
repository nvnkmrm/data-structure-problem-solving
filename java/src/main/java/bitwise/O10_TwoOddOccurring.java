package bitwise;

import java.util.Arrays;

public class O10_TwoOddOccurring {

    //redid - 2
    public int[] efficientSolution(int[] a) {
        int[] res = new int[2];
        int xor = 0;
        for (int element : a) {
            xor ^= element;
        }
        int rightMostSetBit = xor & (~(xor - 1));
        for (int element : a) {
            if ((element & rightMostSetBit) != 0) {
                res[0] ^= element;
            } else {
                res[1] ^= element;
            }
        }
        Arrays.sort(res);
        return res;
    }
}
