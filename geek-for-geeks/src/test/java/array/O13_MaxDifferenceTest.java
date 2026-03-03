package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O13_MaxDifferenceTest {

    @Test
    public void shouldReturnMaxDifferenceInArray() {
        O13_MaxDifference maxDifference = new O13_MaxDifference();
        int actual = maxDifference.findMaxDifference(new int[]{2, 3, 10, 6, 4, 8, 1});
        assertEquals(8, actual);
        actual = maxDifference.findMaxDifference(new int[]{1});
        assertEquals(Integer.MIN_VALUE, actual);
        actual = maxDifference.findMaxDifference(new int[]{3, 2, 1, 10, 2, 3, 4});
        assertEquals(9, actual);
    }
}