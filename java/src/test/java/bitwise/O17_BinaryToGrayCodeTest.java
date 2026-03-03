package bitwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O17_BinaryToGrayCodeTest {

    @Test
    public void shouldReturnGrayCodeOfGivenNumber() {
        O17_BinaryToGrayCode binaryToGrayCode = new O17_BinaryToGrayCode();
        int actual = binaryToGrayCode.convert(7);
        Assertions.assertEquals(actual, 4);
        actual = binaryToGrayCode.convert(10);
        Assertions.assertEquals(actual, 15);
        actual = binaryToGrayCode.convert(0);
        Assertions.assertEquals(actual, 0);
    }
}