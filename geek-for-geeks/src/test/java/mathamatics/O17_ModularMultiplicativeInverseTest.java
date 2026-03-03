package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O17_ModularMultiplicativeInverseTest {

    @Test
    public void shouldReturnModularMultiplicativeInverse() {
        O17_ModularMultiplicativeInverse modularMultiplicativeInverse = new O17_ModularMultiplicativeInverse();
        int mInverse = modularMultiplicativeInverse.modularMultiplicativeInverse(3,11);
        assertEquals(4,mInverse);
        mInverse = modularMultiplicativeInverse.modularMultiplicativeInverse(10,17);
        assertEquals(12,mInverse);
        mInverse = modularMultiplicativeInverse.modularMultiplicativeInverse(1,0);
        assertEquals(-1,mInverse);
    }
}