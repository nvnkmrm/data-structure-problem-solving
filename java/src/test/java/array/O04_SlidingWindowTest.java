package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O04_SlidingWindowTest {

    @Test
    public void shouldReturnMaxSumOfKElementsInArray() {
        O04_SlidingWindow slidingWindow = new O04_SlidingWindow();
        int actual = slidingWindow.maxSumOfKElements(new int[]{100, 200, 300, 400}, 2);
        Assertions.assertEquals(700, actual);
        actual = slidingWindow.maxSumOfKElements(new int[]{3, 2, 1, 1, 1, 1}, 3);
        Assertions.assertEquals(6, actual);
        actual = slidingWindow.maxSumOfKElements(new int[]{1, 2}, 3);
        Assertions.assertEquals(Integer.MIN_VALUE, actual);
    }

}