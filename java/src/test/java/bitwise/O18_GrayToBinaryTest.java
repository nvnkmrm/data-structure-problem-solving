package bitwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O18_GrayToBinaryTest {

    @Test
    public void shouldConvertGivenGrayToBinaryForm() {
        O18_GrayToBinary grayToBinary = new O18_GrayToBinary();
        int actual = grayToBinary.convert(4);
        Assertions.assertEquals(7, actual);
        actual = grayToBinary.convert(15);
        Assertions.assertEquals(10, actual);
        actual = grayToBinary.convert(0);
        Assertions.assertEquals(0, actual);
    }
}