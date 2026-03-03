package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O05_MaxANDTest {

    @Test
    public void shouldReturnMaxANDInAnyArrayPair() {
        O05_MaxAND maxAND = new O05_MaxAND();
        int actual = maxAND.findMaxANDValue(new int[]{4, 8, 12, 16});
        assertEquals(8, actual);
        actual = maxAND.findMaxANDValue(new int[]{4, 8, 16, 2});
        assertEquals(0, actual);
    }

}