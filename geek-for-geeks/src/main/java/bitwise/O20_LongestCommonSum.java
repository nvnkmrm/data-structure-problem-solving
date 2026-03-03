package bitwise;

import java.util.Arrays;

public class O20_LongestCommonSum {

    public int naiveSolution(int[] aArr, int[] bArr) {
        int maxLen = 0;
        for (int i = 0; i < aArr.length; i++) {
            int aSum = 0, bSum = 0;
            for (int j = i; j < bArr.length; j++) {
                aSum += aArr[j];
                bSum += bArr[j];
                if (aSum == bSum) {
                    int len = (j >= i) ? j - i + 1 : 0;
                    if (len > maxLen) {
                        maxLen = len;
                    }
                }
            }
        }
        return maxLen;
    }

    public int auxiliarySpaceSolution(int[] aArr, int[] bArr) {
        int n = aArr.length;
        int maxLen = 0;
        int aSum = 0, bSum = 0;
        int[] diff = new int[2 * n + 1];
        Arrays.fill(diff, -1);
        for (int i = 0; i < n; i++) {
            aSum += aArr[i];
            bSum += bArr[i];

            int currDiff = aSum - bSum;
            int diffIndex = n + currDiff;

            if (currDiff == 0) {
                maxLen++;
            } else if (diff[diffIndex] == -1) {
                diff[diffIndex] = i;
            } else {
                int len = i - diff[diffIndex];
                if (len > maxLen) {
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }
}
