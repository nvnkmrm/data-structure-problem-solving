package bitwise;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O06_KthBitSetOrNotTest {

    @Test
    public void shouldCheckIfKthBitIsSetOrNotForGivenPosition() {
        O06_KthBitSetOrNot kthBitSetOrNot = new O06_KthBitSetOrNot();
        boolean actual = kthBitSetOrNot.isBitSet(2,1);
        assertTrue(actual);
        actual = kthBitSetOrNot.isBitSet(4,1);
        assertFalse(actual);
        actual = kthBitSetOrNot.isBitSet(5,0);
        assertTrue(actual);
    }

}