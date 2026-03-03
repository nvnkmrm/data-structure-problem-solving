package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O18_MaxLenEvenOddSubArrayTest {

    @Test
    public void shouldReturnMaxLengthOfEvenOddSubArray() {
        O18_MaxLenEvenOddSubArray maxLenEvenOddSubArray = new O18_MaxLenEvenOddSubArray();
        int actual = maxLenEvenOddSubArray.maxLength(new int[]{1, 2, 3, 4, 5});
        Assertions.assertEquals(5, actual);
        actual = maxLenEvenOddSubArray.maxLength(new int[]{1,1,2,2});
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void shouldReturnMaxLengthOfEvenOddSubArrayUsingKadenceAlgorithm() {
        O18_MaxLenEvenOddSubArray maxLenEvenOddSubArray = new O18_MaxLenEvenOddSubArray();
        int actual = maxLenEvenOddSubArray.kadenceAlgorithm(new int[]{1, 2, 3, 4, 5});
        Assertions.assertEquals(5, actual);
        actual = maxLenEvenOddSubArray.kadenceAlgorithm(new int[]{1,1,2,2});
        Assertions.assertEquals(2, actual);
    }
}