package bitwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O20_LongestCommonSumTest {

    @Test
    public void shouldReturnLongestCommonSumOfGivenArraysUsingNaiveSolution() {
        O20_LongestCommonSum longestCommonSum = new O20_LongestCommonSum();
        int[] aArr = new int[]{0, 1, 0, 0, 0, 0};
        int[] bArr = new int[]{1, 0, 1, 0, 0, 1};
        int actual = longestCommonSum.naiveSolution(aArr, bArr);
        Assertions.assertEquals(4, actual);
        aArr = new int[]{0, 1, 0, 1, 1, 1, 1};
        bArr = new int[]{1, 1, 1, 1, 1, 0, 1};
        actual = longestCommonSum.naiveSolution(aArr, bArr);
        Assertions.assertEquals(6, actual);
        aArr = new int[]{0, 0, 0};
        bArr = new int[]{1, 1, 1};
        actual = longestCommonSum.naiveSolution(aArr, bArr);
        Assertions.assertEquals(0, actual);
        aArr = new int[]{0, 0, 1, 0};
        bArr = new int[]{1, 1, 1, 1};
        actual = longestCommonSum.naiveSolution(aArr, bArr);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void shouldReturnLongestCommonSumOfGivenArraysUsingAuxiliarySpaceSolution() {
        O20_LongestCommonSum longestCommonSum = new O20_LongestCommonSum();
        int[] aArr = new int[]{0, 1, 0, 0, 0, 0};
        int[] bArr = new int[]{1, 0, 1, 0, 0, 1};
        int actual = longestCommonSum.auxiliarySpaceSolution(aArr, bArr);
        Assertions.assertEquals(4, actual);
        aArr = new int[]{0, 1, 0, 1, 1, 1, 1};
        bArr = new int[]{1, 1, 1, 1, 1, 0, 1};
        actual = longestCommonSum.auxiliarySpaceSolution(aArr, bArr);
        Assertions.assertEquals(6, actual);
        aArr = new int[]{0, 0, 0};
        bArr = new int[]{1, 1, 1};
        actual = longestCommonSum.auxiliarySpaceSolution(aArr, bArr);
        Assertions.assertEquals(0, actual);
        aArr = new int[]{0, 0, 1, 0};
        bArr = new int[]{1, 1, 1, 1};
        actual = longestCommonSum.auxiliarySpaceSolution(aArr, bArr);
        Assertions.assertEquals(1, actual);
    }

}