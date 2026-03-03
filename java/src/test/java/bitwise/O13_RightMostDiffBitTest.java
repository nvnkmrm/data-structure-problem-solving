package bitwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O13_RightMostDiffBitTest {

    @Test
    public void shouldReturnPositionOfRightMostDiffSetBit() {
        O13_RightMostDiffBit rightMostDiffBit = new O13_RightMostDiffBit();
        int actual = rightMostDiffBit.rightMostDiffBitPosition(11, 9);
        Assertions.assertEquals(2, actual);
        actual = rightMostDiffBit.rightMostDiffBitPosition(52, 4);
        Assertions.assertEquals(5, actual);
        actual = rightMostDiffBit.rightMostDiffBitPosition(9, 9);
        Assertions.assertEquals(-1, actual);
    }

}