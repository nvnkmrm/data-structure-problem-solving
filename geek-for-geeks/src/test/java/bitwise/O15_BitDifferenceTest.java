package bitwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O15_BitDifferenceTest {

    @Test
    public void shouldReturnCountOfBitDifferenceInGivenTwoNumbers() {
        O15_BitDifference bitDifference = new O15_BitDifference();
        int actual = bitDifference.countBitDifference(10, 20);
        Assertions.assertEquals(4, actual);
        actual = bitDifference.countBitDifference(20, 25);
        Assertions.assertEquals(3, actual);
    }

}