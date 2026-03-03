package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O12_FirstSetBitTest {

    @Test
    public void shouldReturnPositionOfFirstSetBitInGivenNumber() {
        O12_FirstSetBit firstSetBit = new O12_FirstSetBit();
        int actual = firstSetBit.firstBitPosition(18);
        assertEquals(2, actual);
        actual = firstSetBit.firstBitPosition(12);
        assertEquals(3, actual);
    }

}