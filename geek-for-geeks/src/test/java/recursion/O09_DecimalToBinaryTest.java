package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O09_DecimalToBinaryTest {

    @Test
    public void shouldReturnBinaryOfGivenDecimal() {
        O09_DecimalToBinary decimalToBinary = new O09_DecimalToBinary();
        String actual = decimalToBinary.convert(7);
        Assertions.assertEquals("111",actual);
        actual = decimalToBinary.convert(4);
        Assertions.assertEquals("100",actual);
    }

}