package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O11_AllDivisorsOfNumberTest {

    @Test
    public void shouldReturnAllDivisorsOfNumberWithoutOrder() {
        O11_AllDivisorsOfNumber divisorsOfNumber = new O11_AllDivisorsOfNumber();
        int[] actual = divisorsOfNumber.divisorOfNumberWithoutOrder(25);
        assertArrayEquals(new int[]{1,25,5},actual);
    }

    @Test
    public void shouldReturnAllDivisorsOfNumberWithOrder() {
        O11_AllDivisorsOfNumber divisorsOfNumber = new O11_AllDivisorsOfNumber();
        int[] actual = divisorsOfNumber.divisorOfNumberWithOrder(25);
        assertArrayEquals(new int[]{1,5,25},actual);
    }

}