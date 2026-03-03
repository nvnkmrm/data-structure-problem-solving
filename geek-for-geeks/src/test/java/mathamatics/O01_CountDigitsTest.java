package mathamatics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class O01_CountDigitsTest {

    @Test
    public void shouldCountDigitsOfGivenNumberUsingLookMethod() {
        O01_CountDigits countDigits = new O01_CountDigits();
        int actualCount = countDigits.loopMethod(1234);
        assertEquals(4,actualCount);
        actualCount = countDigits.loopMethod(123);
        assertEquals(3,actualCount);
        actualCount = countDigits.loopMethod(1);
        assertEquals(1,actualCount);
    }

    @Test
    public void shouldCountDigitsOfGivenNumberUsingRecursiveMethod() {
        O01_CountDigits countDigits = new O01_CountDigits();
        int actualCount = countDigits.recursiveMethod(1234);
        assertEquals(4,actualCount);
        actualCount = countDigits.recursiveMethod(123);
        assertEquals(3,actualCount);
        actualCount = countDigits.recursiveMethod(1);
        assertEquals(1,actualCount);
    }

    @Test
    public void shouldCountDigitsOfGivenNumberUsingLogMethod() {
        O01_CountDigits countDigits = new O01_CountDigits();
        int actualCount = countDigits.logMethod(1234);
        assertEquals(4,actualCount);
        actualCount = countDigits.logMethod(123);
        assertEquals(3,actualCount);
        actualCount = countDigits.logMethod(1);
        assertEquals(1,actualCount);
    }
}
