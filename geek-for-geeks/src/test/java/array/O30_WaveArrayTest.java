package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O30_WaveArrayTest {

    @Test
    public void shouldReturnWaveArrayForGivenArray() {
        O30_WaveArray waveArray = new O30_WaveArray();
        int[] actual = waveArray.convert(new int[]{1, 2, 3, 4, 5});
        Assertions.assertArrayEquals(new int[]{2, 1, 4, 3, 5}, actual);
        actual = waveArray.convert(new int[]{2, 4, 7, 8, 9, 10});
        Assertions.assertArrayEquals(new int[]{4, 2, 8, 7, 10, 9}, actual);
    }

}