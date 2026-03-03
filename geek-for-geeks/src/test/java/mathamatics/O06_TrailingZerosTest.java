package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O06_TrailingZerosTest {

    @Test
    public void shouldReturnCountOfTrailingZerosOfGivenNumber() {
        O06_TrailingZeros trailingZeros = new O06_TrailingZeros();
        int actualCount = trailingZeros.getTrailingZeros(5);
        assertEquals(1,actualCount);
        actualCount = trailingZeros.getTrailingZeros(100);
        assertEquals(24,actualCount);
    }

}