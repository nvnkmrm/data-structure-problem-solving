package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class O15_Exactly3DivisorsTest {

    @Test
    public void shouldReturnArrayOf3DivisorNumberForGivenRange() {
        long start = System.currentTimeMillis();
        O15_Exactly3Divisors exactly3Divisors = new O15_Exactly3Divisors();
        int[] actualThreeDivisors = exactly3Divisors.threeDivisors(16);
        assertArrayEquals(new int[]{4, 9}, actualThreeDivisors);
        actualThreeDivisors = exactly3Divisors.threeDivisors(49);
        assertArrayEquals(new int[]{4, 9, 25, 49}, actualThreeDivisors);
        actualThreeDivisors = exactly3Divisors.threeDivisors(0);
        assertArrayEquals(new int[]{}, actualThreeDivisors);
        actualThreeDivisors = exactly3Divisors.threeDivisors(1);
        assertArrayEquals(new int[]{}, actualThreeDivisors);
        actualThreeDivisors = exactly3Divisors.threeDivisors(6);
        assertArrayEquals(new int[]{4}, actualThreeDivisors);
        long end = System.currentTimeMillis();
        System.out.println("Time taken " + (end - start) + "ms");
    }

    @Test
    public void shouldReturnArrayOf3DivisorNumberForGivenRangeWithO1AuxilliarySpace() {
        long start = System.currentTimeMillis();
        O15_Exactly3Divisors exactly3Divisors = new O15_Exactly3Divisors();
        int[] actualThreeDivisors = exactly3Divisors.threeDivisorsWithO1AuxilliarySpace(16);
        assertArrayEquals(new int[]{4, 9}, actualThreeDivisors);
        actualThreeDivisors = exactly3Divisors.threeDivisorsWithO1AuxilliarySpace(49);
        assertArrayEquals(new int[]{4, 9, 25, 49}, actualThreeDivisors);
        actualThreeDivisors = exactly3Divisors.threeDivisorsWithO1AuxilliarySpace(0);
        assertArrayEquals(new int[]{}, actualThreeDivisors);
        actualThreeDivisors = exactly3Divisors.threeDivisorsWithO1AuxilliarySpace(1);
        assertArrayEquals(new int[]{}, actualThreeDivisors);
        actualThreeDivisors = exactly3Divisors.threeDivisorsWithO1AuxilliarySpace(6);
        assertArrayEquals(new int[]{4}, actualThreeDivisors);
        long end = System.currentTimeMillis();
        System.out.println("Time taken " + (end - start) + "ms");
    }
}