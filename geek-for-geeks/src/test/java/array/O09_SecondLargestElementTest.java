package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O09_SecondLargestElementTest {

    @Test
    public void shouldReturnIndexOfSecondLargestElement() {
        O09_SecondLargestElement secondLargestElement = new O09_SecondLargestElement();
        int actual = secondLargestElement.find(new int[]{1, 2, 3, 4, 5});
        assertEquals(3, actual);
        actual = secondLargestElement.find(new int[]{1, 1, 1, 2});
        assertEquals(0, actual);
    }

}