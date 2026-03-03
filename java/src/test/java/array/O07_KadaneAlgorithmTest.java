package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O07_KadaneAlgorithmTest {

    @Test
    public void shouldReturnLargestSumOfSubArrayUsingNaiveSolution() {
        O07_KadaneAlgorithm kadaneAlgorithm = new O07_KadaneAlgorithm();
        int actual = kadaneAlgorithm.maxSubArraySumUsingNaiveSolution(new int[]{-3, 4, -1, -2, 1, 5});
        assertEquals(7, actual);
        actual = kadaneAlgorithm.maxSubArraySumUsingNaiveSolution(new int[]{-1, 1, 5, -4, -2, 3, -2, 6});
        assertEquals(7, actual);
    }

    @Test
    public void shouldReturnLargestSumOfSubArray() {
        O07_KadaneAlgorithm kadaneAlgorithm = new O07_KadaneAlgorithm();
        int actual = kadaneAlgorithm.largestSumSubArray(new int[]{-3, 4, -1, -2, 1, 5});
        assertEquals(7, actual);
        actual = kadaneAlgorithm.largestSumSubArray(new int[]{-1, 1, 5, -4, -2, 3, -2, 6});
        assertEquals(7, actual);
    }

}