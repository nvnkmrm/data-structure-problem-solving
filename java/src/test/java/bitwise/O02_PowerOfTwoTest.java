package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class O02_PowerOfTwoTest {

    @Test
    public void shouldCheckGivenNumberIsPowerOfTwoOrNotUsingNaiveSolution() {
        O02_PowerOfTwo powerOfTwo = new O02_PowerOfTwo();
        boolean actual = powerOfTwo.naiveSolution(4);
        assertTrue(actual);
        actual = powerOfTwo.naiveSolution(5);
        assertFalse(actual);
        actual = powerOfTwo.naiveSolution(256);
        assertTrue(actual);
    }

    @Test
    public void shouldCheckGivenNumberIsPowerOfTwoOrNot() {
        O02_PowerOfTwo powerOfTwo = new O02_PowerOfTwo();
        boolean actual = powerOfTwo.isPowerOfTwo(4);
        assertTrue(actual);
        actual = powerOfTwo.isPowerOfTwo(5);
        assertFalse(actual);
        actual = powerOfTwo.isPowerOfTwo(256);
        assertTrue(actual);
        actual = powerOfTwo.isPowerOfTwo(0);
        assertFalse(actual);
    }

}