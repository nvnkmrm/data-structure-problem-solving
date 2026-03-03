package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O03_ArrayRotationTest {

    @Test
    public void shouldRotateArrayUsingTempArrayMethod() {
        O03_ArrayRotation arrayRotation = new O03_ArrayRotation();
        int[] actualArray = arrayRotation.rotateUsingTempArr(new int[]{1, 2, 3, 4, 5}, 3);
        Assertions.assertArrayEquals(new int[]{4, 5, 1, 2, 3}, actualArray);
        actualArray = arrayRotation.rotateUsingTempArr(new int[]{1, 2, 3, 4, 5, 6}, 1);
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 1}, actualArray);
        actualArray = arrayRotation.rotateUsingTempArr(new int[]{1, 2, 3, 4, 5, 6}, 6);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateUsingTempArr(new int[]{1, 2, 3, 4, 5, 6}, 0);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateUsingTempArr(new int[]{1, 2, 3, 4, 5, 6}, 4);
        Assertions.assertArrayEquals(new int[]{5, 6, 1, 2, 3, 4}, actualArray);
    }

    @Test
    public void shouldRotateArrayUsingOneByOneMethod() {
        O03_ArrayRotation arrayRotation = new O03_ArrayRotation();
        int[] actualArray = arrayRotation.rotateOneAtTime(new int[]{1, 2, 3, 4, 5}, 3);
        Assertions.assertArrayEquals(new int[]{4, 5, 1, 2, 3}, actualArray);
        actualArray = arrayRotation.rotateOneAtTime(new int[]{1, 2, 3, 4, 5, 6}, 1);
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 1}, actualArray);
        actualArray = arrayRotation.rotateOneAtTime(new int[]{1, 2, 3, 4, 5, 6}, 6);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateOneAtTime(new int[]{1, 2, 3, 4, 5, 6}, 0);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateOneAtTime(new int[]{1, 2, 3, 4, 5, 6}, 4);
        Assertions.assertArrayEquals(new int[]{5, 6, 1, 2, 3, 4}, actualArray);
    }

    @Test
    public void shouldRotateArrayUsingJugglingAlgorithm() {
        O03_ArrayRotation arrayRotation = new O03_ArrayRotation();
        int[] actualArray = arrayRotation.rotateUsingJugglingAlgorithm(new int[]{1, 2, 3, 4, 5}, 3);
        Assertions.assertArrayEquals(new int[]{4, 5, 1, 2, 3}, actualArray);
        actualArray = arrayRotation.rotateUsingJugglingAlgorithm(new int[]{1, 2, 3, 4, 5, 6}, 1);
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 1}, actualArray);
        actualArray = arrayRotation.rotateUsingJugglingAlgorithm(new int[]{1, 2, 3, 4, 5, 6}, 6);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateUsingJugglingAlgorithm(new int[]{1, 2, 3, 4, 5, 6}, 0);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateUsingJugglingAlgorithm(new int[]{1, 2, 3, 4, 5, 6}, 4);
        Assertions.assertArrayEquals(new int[]{5, 6, 1, 2, 3, 4}, actualArray);
    }

    @Test
    public void shouldRotateArrayUsingReversalMethod() {
        O03_ArrayRotation arrayRotation = new O03_ArrayRotation();
        int[] actualArray = arrayRotation.rotateUsingReverseMethod(new int[]{1, 2, 3, 4, 5}, 3);
        Assertions.assertArrayEquals(new int[]{4, 5, 1, 2, 3}, actualArray);
        actualArray = arrayRotation.rotateUsingReverseMethod(new int[]{1, 2, 3, 4, 5, 6}, 1);
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 1}, actualArray);
        actualArray = arrayRotation.rotateUsingReverseMethod(new int[]{1, 2, 3, 4, 5, 6}, 6);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateUsingReverseMethod(new int[]{1, 2, 3, 4, 5, 6}, 0);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actualArray);
        actualArray = arrayRotation.rotateUsingReverseMethod(new int[]{1, 2, 3, 4, 5, 6}, 4);
        Assertions.assertArrayEquals(new int[]{5, 6, 1, 2, 3, 4}, actualArray);
    }

    @Test
    public void shouldLeftRotateArrayByOne() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        O03_ArrayRotation arrayRotation = new O03_ArrayRotation();
        arrayRotation.leftRotateArrayByOne(arr);
        Assertions.assertArrayEquals(new int[]{2, 3, 4, 5, 1}, arr);
        arrayRotation.leftRotateArrayByOne(arr);
        arrayRotation.leftRotateArrayByOne(arr);
        Assertions.assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr);
    }

}