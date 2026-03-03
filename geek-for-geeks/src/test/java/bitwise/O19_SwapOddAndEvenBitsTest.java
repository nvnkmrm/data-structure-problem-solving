package bitwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O19_SwapOddAndEvenBitsTest {

    @Test
    public void shouldSwapOddAndEvenBitsOfGivenNumber() {
        O19_SwapOddAndEvenBits swapOddAndEvenBits = new O19_SwapOddAndEvenBits();
        int actual = swapOddAndEvenBits.swap(23);
        Assertions.assertEquals(43, actual);
        actual = swapOddAndEvenBits.swap(2);
        Assertions.assertEquals(1, actual);
    }

}