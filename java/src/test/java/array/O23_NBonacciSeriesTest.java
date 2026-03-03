package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O23_NBonacciSeriesTest {

    @Test
    public void shouldReturnNBonacciSeries() {
        O23_NBonacciSeries nBonacciSeries = new O23_NBonacciSeries();
        int[] actual = nBonacciSeries.nBonacciSeries(4, 10);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 1, 1, 2, 4, 8, 15, 29}, actual);
        actual = nBonacciSeries.nBonacciSeries(5, 15);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 1, 1, 2, 4, 8, 16, 31, 61, 120, 236, 464}, actual);
    }
}