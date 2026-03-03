package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O31_FrequencyOfLimArrRangeElementTest {

    @Test
    public void shouldReturnFrequencyOfElements() {
        O31_FrequencyOfLimArrRangeElement frequencyOfLimArrRangeElement = new O31_FrequencyOfLimArrRangeElement();
        int[] arr = frequencyOfLimArrRangeElement.frequencyOfElements(new int[]{2, 3, 2, 3, 5}, 5, 5);
        Assertions.assertArrayEquals(new int[]{0, 2, 2, 0, 1}, arr);
        arr = frequencyOfLimArrRangeElement.frequencyOfElements(new int[]{1, 2, 3, 3, 5, 5}, 6, 5);
        Assertions.assertArrayEquals(new int[]{1, 1, 2, 0, 2, 0}, arr);
    }
}