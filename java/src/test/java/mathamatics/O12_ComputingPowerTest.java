package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O12_ComputingPowerTest {

    @Test
    public void shouldComputeThePowerOfGivenNumber() {
        O12_ComputingPower computingPower = new O12_ComputingPower();
        int actualPower = computingPower.pow(2, 3);
        assertEquals(8, actualPower);
        actualPower = computingPower.pow(3, 3);
        assertEquals(27, actualPower);
        actualPower = computingPower.pow(4, 3);
        assertEquals(64, actualPower);
    }

}