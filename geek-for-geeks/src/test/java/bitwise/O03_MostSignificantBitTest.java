package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O03_MostSignificantBitTest {

    @Test
    public void shouldReturnMSGofGivenNumber() {
        O03_MostSignificantBit mostSignificantBit = new O03_MostSignificantBit();
        int actual = mostSignificantBit.msb(18);
        assertEquals(16, actual);
        actual = mostSignificantBit.msb(10);
        assertEquals(8, actual);
        actual = mostSignificantBit.msb(0);
        assertEquals(0, actual);
    }

}