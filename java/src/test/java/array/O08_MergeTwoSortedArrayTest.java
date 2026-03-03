package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O08_MergeTwoSortedArrayTest {

    @Test
    public void shouldMergeTwoSortedArray() {
        O08_MergeTwoSortedArray mergeTwoSortedArray = new O08_MergeTwoSortedArray();
        int[] actual = mergeTwoSortedArray.merge(new int[]{1, 3, 5}, new int[]{2, 4, 6, 7, 8});
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, actual);
        actual = mergeTwoSortedArray.merge(new int[]{1, 3}, new int[]{2, 4});
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4}, actual);
    }
}