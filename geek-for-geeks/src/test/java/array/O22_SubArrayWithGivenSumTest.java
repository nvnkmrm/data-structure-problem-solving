package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O22_SubArrayWithGivenSumTest {

    @Test
    public void shouldReturnTrueGivenSumIsPresentInSubArrayFalseOtherwise() {
        O22_SubArrayWithGivenSum subArrayWithGivenSum = new O22_SubArrayWithGivenSum();
        boolean actual = subArrayWithGivenSum.subArraySum(new int[]{1, 4, 20, 3, 10, 5}, 33);
        Assertions.assertTrue(actual);
        actual = subArrayWithGivenSum.subArraySum(new int[]{1}, 1);
        Assertions.assertTrue(actual);
        actual = subArrayWithGivenSum.subArraySum(new int[]{1, 2, 3, 4, 5}, 12);
        Assertions.assertTrue(actual);
        actual = subArrayWithGivenSum.subArraySum(new int[]{1, 2, 3, 4, 50, 3}, 50);
        Assertions.assertTrue(actual);
        actual = subArrayWithGivenSum.subArraySum(new int[]{1, 2, 3, 4, 61, 3}, 50);
        Assertions.assertFalse(actual);
    }

}