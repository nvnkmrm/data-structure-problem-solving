package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O24_CountDistinctWindowTest {

    @Test
    public void shouldReturnDistinctCountOfWindow() {
        O24_CountDistinctWindow countDistinctWindow = new O24_CountDistinctWindow();
        int[] actual = countDistinctWindow.countDistinctWindow(new int[]{1, 2, 1, 3, 4, 2, 3}, 4);
        Assertions.assertArrayEquals(new int[]{3, 4, 4, 3}, actual);
        actual = countDistinctWindow.countDistinctWindow(new int[]{1, 1, 3, 3, 2, 4, 2, 4, 5, 6}, 3);
        Assertions.assertArrayEquals(new int[]{2, 2, 2, 3, 2, 2, 3, 3}, actual);
    }

}