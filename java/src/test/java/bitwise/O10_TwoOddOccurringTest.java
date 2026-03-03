package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class O10_TwoOddOccurringTest {

    @Test
    public void shouldTwoOddOccurringTermsInGivenArray() {
        O10_TwoOddOccurring twoOddOccurring = new O10_TwoOddOccurring();
        int[] actual = twoOddOccurring.efficientSolution(new int[]{1, 1, 2, 2, 4, 5, 5, 7, 6, 6, 6, 6});
        assertArrayEquals(new int[]{4, 7}, actual);
        actual = twoOddOccurring.efficientSolution(new int[]{1, 1, 2, 3});
        assertArrayEquals(new int[]{2, 3}, actual);
    }

}