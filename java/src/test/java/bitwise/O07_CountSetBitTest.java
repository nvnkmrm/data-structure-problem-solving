package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O07_CountSetBitTest {

    @Test
    public void shouldCountOfSetBitUsingNaiveSolution() {
        O07_CountSetBit countSetBit = new O07_CountSetBit();
        int actual = countSetBit.naiveSolution(7);
        assertEquals(3, actual);
        actual = countSetBit.naiveSolution(5);
        assertEquals(2, actual);
        actual = countSetBit.naiveSolution(40);
        assertEquals(2, actual);
    }

    @Test
    public void shouldCountOfSetBitUsingBrianKerringamsAlgorithm() {
        O07_CountSetBit countSetBit = new O07_CountSetBit();
        int actual = countSetBit.brianKerringamsAlgorithm(7);
        assertEquals(3, actual);
        actual = countSetBit.brianKerringamsAlgorithm(5);
        assertEquals(2, actual);
        actual = countSetBit.brianKerringamsAlgorithm(40);
        assertEquals(2, actual);
    }

    @Test
    public void shouldCountOfSetBitUsingLookUpTableMethod() {
        O07_CountSetBit countSetBit = new O07_CountSetBit();
        int actual = countSetBit.lookUpTableMethod(7);
        assertEquals(3, actual);
        actual = countSetBit.lookUpTableMethod(5);
        assertEquals(2, actual);
        actual = countSetBit.lookUpTableMethod(40);
        assertEquals(2, actual);
    }


}