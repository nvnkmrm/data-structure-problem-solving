package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O14_FrequencyOfSortedArrayTest {

    @Test
    public void shouldPrintFrequencyOfSortedArray() {
        O14_FrequencyOfArray frequencyOfSortedArray = new O14_FrequencyOfArray();
        frequencyOfSortedArray.frequencyOfSortedArray(new int[]{1, 1, 1, 2, 2, 3, 3});
        frequencyOfSortedArray.frequencyOfSortedArray(new int[]{1, 1, 2, 3});
        frequencyOfSortedArray.frequencyOfSortedArray(new int[]{1});
    }

    @Test
    public void shouldPrintFrequencyOfUnsortedArrayUsingNegativeMethod() {
        O14_FrequencyOfArray frequencyOfSortedArray = new O14_FrequencyOfArray();
        int[] actual = frequencyOfSortedArray.frequencyOfUnSortedArrayUsingNegativeApproach(new int[]{1, 1, 1, 2, 2, 3, 3});
        Assertions.assertArrayEquals(new int[]{-3, -2, -2, 0, 0, 0, 0}, actual);
        actual = frequencyOfSortedArray.frequencyOfUnSortedArrayUsingNegativeApproach(new int[]{1, 1, 2, 3});
        Assertions.assertArrayEquals(new int[]{-2, -1, -1, 0}, actual);
        frequencyOfSortedArray.frequencyOfUnSortedArrayUsingNegativeApproach(new int[]{1});
    }

    @Test
    public void shouldPrintFrequencyOfUnsortedArrayUsingAddingNMethod() {
        O14_FrequencyOfArray frequencyOfSortedArray = new O14_FrequencyOfArray();
        int[] actual = frequencyOfSortedArray.frequencyOfUnSortedArrayUsingAddingNApproach(new int[]{1, 1, 1, 2, 2, 3, 3});
        Assertions.assertArrayEquals(new int[]{3, 2, 2, 0, 0, 0, 0}, actual);
        actual = frequencyOfSortedArray.frequencyOfUnSortedArrayUsingAddingNApproach(new int[]{1, 1, 2, 3});
        Assertions.assertArrayEquals(new int[]{2, 1, 1, 0}, actual);
        actual = frequencyOfSortedArray.frequencyOfUnSortedArrayUsingAddingNApproach(new int[]{1});
        Assertions.assertArrayEquals(new int[]{1}, actual);
    }

}