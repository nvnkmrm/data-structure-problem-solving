package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O14_SubsetSumTest {

    @Test
    public void shouldReturnSubsetSumForGivenSumArray() {
        O14_SubsetSum subsetSum = new O14_SubsetSum();
        int actual = subsetSum.subsetSum(new int[]{10, 15, 25}, 3, 25);
        Assertions.assertEquals(2, actual);
        actual = subsetSum.subsetSum(new int[]{5, 1, 4, 2, 3}, 5, 5);
        Assertions.assertEquals(3, actual);
        actual = subsetSum.subsetSum(new int[]{5, 3, 3, 1}, 4, 6);
        Assertions.assertEquals(2, actual);
    }
}