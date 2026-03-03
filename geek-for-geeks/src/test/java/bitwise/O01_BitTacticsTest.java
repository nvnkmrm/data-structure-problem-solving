package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O01_BitTacticsTest {

    private final O01_BitTactics bitTactics = new O01_BitTactics();

    @Test
    public void shouldSetBitAtNthPositionInGivenNumber() {
        int actual = bitTactics.setBit(16, 3);
        assertEquals(24, actual);
        actual = bitTactics.setBit(5, 1);
        assertEquals(7, actual);
    }

    @Test
    public void shouldUnSetBitAtNthPositionInGivenNumber() {
        int actual = bitTactics.unSetBit(24, 3);
        assertEquals(16, actual);
        actual = bitTactics.unSetBit(7, 1);
        assertEquals(5, actual);
    }

    @Test
    public void shouldToggleBitAtNthPositionInGivenNumber() {
        int actual = bitTactics.toggleBit(24, 3);
        assertEquals(16, actual);
        actual = bitTactics.toggleBit(7, 1);
        assertEquals(5, actual);
    }

    @Test
    public void shouldReturnTrueIfBitSetAtNthPositionInGivenNumber() {
        boolean actual = bitTactics.isSetBitSet(24, 3);
        assertTrue(actual);
        actual = bitTactics.isSetBitSet(7, 1);
        assertTrue(actual);
    }

    @Test
    public void shouldReturnDivisionOfTwoOfGivenNumber() {
        int actual = bitTactics.divideByTwo(18);
        assertEquals(9, actual);
        actual = bitTactics.divideByTwo(36);
        assertEquals(18, actual);
    }

    @Test
    public void shouldReturnMultiplicationOfTwoOfGivenNumber() {
        int actual = bitTactics.multiplyByTwo(18);
        assertEquals(36, actual);
        actual = bitTactics.multiplyByTwo(9);
        assertEquals(18, actual);
    }

    @Test
    public void shouldReturnLogBaseTwoOfGivenNumber() {
        int actual = bitTactics.logBaseTwo(16);
        assertEquals(4, actual);
        actual = bitTactics.logBaseTwo(128);
        assertEquals(7, actual);
    }

    @Test
    public void shouldSwapTheNumbersInGivenNumber() {
        int[] actual = bitTactics.swap(new int[]{1, 2});
        assertArrayEquals(new int[]{2, 1}, actual);
        actual = bitTactics.swap(new int[]{3, 4});
        assertArrayEquals(new int[]{4, 3}, actual);
    }

}