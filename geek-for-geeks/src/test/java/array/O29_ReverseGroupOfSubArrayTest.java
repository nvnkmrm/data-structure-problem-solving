package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O29_ReverseGroupOfSubArrayTest {

    @Test
    public void shouldReverseSubArrayInGroup() {
        O29_ReverseGroupOfSubArray reverseGroupOfSubArray = new O29_ReverseGroupOfSubArray();
        int[] actual = reverseGroupOfSubArray.reverseSubArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3);
        Assertions.assertArrayEquals(new int[]{3, 2, 1, 6, 5, 4, 9, 8, 7}, actual);
        actual = reverseGroupOfSubArray.reverseSubArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 5);
        Assertions.assertArrayEquals(new int[]{5, 4, 3, 2, 1, 8, 7, 6}, actual);
        actual = reverseGroupOfSubArray.reverseSubArray(new int[]{1, 2, 3, 4, 5, 6}, 1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actual);
    }

}