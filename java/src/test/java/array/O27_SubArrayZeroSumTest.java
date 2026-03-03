package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O27_SubArrayZeroSumTest {

    @Test
    public void shouldReturnTrueIfSubArrayWithZeroSumExist() {
        O27_SubArrayZeroSum subArrayZeroSum = new O27_SubArrayZeroSum();
        boolean actual = subArrayZeroSum.isZeroSumExist(new int[]{4, 2, -3, 1, 6});
        Assertions.assertTrue(actual);
        actual = subArrayZeroSum.isZeroSumExist(new int[]{4, 2, 0, 1, 6});
        Assertions.assertTrue(actual);
        actual = subArrayZeroSum.isZeroSumExist(new int[]{-3, 2, 3, 1, 6});
        Assertions.assertFalse(actual);

    }
}