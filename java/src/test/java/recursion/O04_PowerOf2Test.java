package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class O04_PowerOf2Test {
    @Test
    public void shouldGeneratePowerOf2ForGivenRangeNumber5() {
        O04_PowerOf2 powerOf2 = new O04_PowerOf2();
        int lastPowerOf2 = powerOf2.powerOf2(5);
        assertEquals(4,lastPowerOf2);
    }

    @Test
    public void shouldGeneratePowerOf2ForGivenRangeNumber10() {
        O04_PowerOf2 powerOf2 = new O04_PowerOf2();
        int lastPowerOf2 = powerOf2.powerOf2(10);
        assertEquals(8,lastPowerOf2);
    }
}
