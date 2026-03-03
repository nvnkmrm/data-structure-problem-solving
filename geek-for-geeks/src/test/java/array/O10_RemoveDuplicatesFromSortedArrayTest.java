package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O10_RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void shouldRemoveDuplicatesFromSortedArray() {
        O10_RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new O10_RemoveDuplicatesFromSortedArray();
        int[] actual = removeDuplicatesFromSortedArray.naiveSolution(new int[]{1, 1, 1, 2, 3, 3, 4, 4, 4});
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 0, 0, 0, 0, 0}, actual);
    }

    @Test
    public void shouldRemoveDuplicatesFromSortedArrayUsingEfficientSolution() {
        O10_RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new O10_RemoveDuplicatesFromSortedArray();
        int actual = removeDuplicatesFromSortedArray.efficientSolution(new int[]{1, 1, 1, 2, 3, 3, 4, 4, 4});
        Assertions.assertEquals(4, actual);
        actual = removeDuplicatesFromSortedArray.efficientSolution(new int[]{1, 1});
        Assertions.assertEquals(1, actual);
    }

}