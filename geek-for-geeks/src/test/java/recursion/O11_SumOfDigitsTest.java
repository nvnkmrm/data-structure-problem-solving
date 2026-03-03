package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O11_SumOfDigitsTest {

    @Test
    public void shouldReturnSumDigitsUsingRecursion() {
        O11_SumOfDigits sumOfDigits = new O11_SumOfDigits();
        int actual = sumOfDigits.sum(9987);
        Assertions.assertEquals(33, actual);
        actual = sumOfDigits.sum(253);
        Assertions.assertEquals(10, actual);
        actual = sumOfDigits.sum(10);
        Assertions.assertEquals(1, actual);
    }

}