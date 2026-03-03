package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O14_DigitsInFactorialTest {

    @Test
    public void shouldReturnTheDigitsOfGivenFactorial() {
        O14_DigitsInFactorial digitsInFactorial = new O14_DigitsInFactorial();
        int actual = digitsInFactorial.countDigits(5);
        assertEquals(3,actual);
        actual = digitsInFactorial.countDigits(10);
        assertEquals(7,actual);
        actual = digitsInFactorial.countDigits(120);
        assertEquals(199,actual);
    }

}