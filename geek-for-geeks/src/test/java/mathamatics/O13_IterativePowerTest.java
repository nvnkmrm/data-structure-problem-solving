package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O13_IterativePowerTest {

    @Test
    public void shouldReturnThePowerOfNumberUsingIterativeApproach() {
        O13_IterativePower iterativePower = new O13_IterativePower();
        int actualPower = iterativePower.pow(3,10);
        assertEquals(59049,actualPower);
        actualPower = iterativePower.pow(10,0);
        assertEquals(1,actualPower);
        actualPower = iterativePower.pow(10,1);
        assertEquals(10,actualPower);
    }

    @Test
    public void shouldReturnThePowerOfNumberUsingModularApproach() {
        O13_IterativePower iterativePower = new O13_IterativePower();
        long actualPower = iterativePower.modularExponentiation(9223372036854775807L,10,1000000007L);
        assertEquals(394962753,actualPower);
    }
}