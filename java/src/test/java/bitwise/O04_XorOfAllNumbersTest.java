package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O04_XorOfAllNumbersTest {

    @Test
    public void shouldReturnXorOfAllNumbers() {
        O04_XorOfAllNumbers xorOfAllNumbers = new O04_XorOfAllNumbers();
        int actual = xorOfAllNumbers.xorAll(6);
        assertEquals(7, actual);
        actual = xorOfAllNumbers.xorAll(5);
        assertEquals(1, actual);
        actual = xorOfAllNumbers.xorAll(7);
        assertEquals(0, actual);
        actual = xorOfAllNumbers.xorAll(16);
        assertEquals(16, actual);
    }

}