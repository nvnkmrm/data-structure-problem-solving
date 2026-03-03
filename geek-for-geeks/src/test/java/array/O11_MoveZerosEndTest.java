package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O11_MoveZerosEndTest {

    @Test
    public void shouldMoveZerosToEndForPassedArray() {
        O11_MoveZerosEnd moveZerosEnd = new O11_MoveZerosEnd();
        int[] arr = new int[]{1, 0, 0, 2, 3};
        moveZerosEnd.moveZeros(arr);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 0, 0}, arr);
        arr = new int[]{1, 0, 2, 0, 3, 0};
        moveZerosEnd.moveZeros(arr);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 0, 0, 0}, arr);
    }

}