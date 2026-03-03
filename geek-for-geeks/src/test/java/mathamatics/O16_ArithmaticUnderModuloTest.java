package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O16_ArithmeticUnderModuloTest {

    @Test
    public void shouldSumGivenTwoLongNumberUnderModulo() {
        O16_ArithmeticUnderModulo arithmeticUnderModulo = new O16_ArithmeticUnderModulo();
        long actual = arithmeticUnderModulo.sum(9223372036854775807L,9223372036854775807L);
        assertEquals(582344006, actual);
        actual = arithmeticUnderModulo.sum(1000000007,1000000007);
        assertEquals(0, actual);
    }

    @Test
    public void shouldMultiplyGivenTwoLongNumberUnderModulo() {
        O16_ArithmeticUnderModulo arithmeticUnderModulo = new O16_ArithmeticUnderModulo();
        long actual = arithmeticUnderModulo.multiply(9223372036854775807L,9223372036854775807L);
        assertEquals(737564071, actual);
        actual = arithmeticUnderModulo.multiply(1000000007,1000000007);
        assertEquals(0, actual);
    }

}