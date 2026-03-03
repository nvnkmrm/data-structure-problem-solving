package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O00_ArrayTest {


    public O00_ArrayTest() {
        createArrayForTest();
    }

    private void createArrayForTest() {

    }

    @Test
    public void shouldInitiateArrayWithSize() {
        O00_Array array = array = new O00_Array(10);
        Assertions.assertNotNull(array);
        Assertions.assertEquals(10, array.size);
        Assertions.assertEquals(0, array.length);
        int[] expectedArray = new int[10];
        Assertions.assertArrayEquals(expectedArray, array.array);
    }

    @Test
    public void shouldInsertElementAtEndOfTheArray() {
        O00_Array array = new O00_Array(2);
        array.insert(1);
        array.insert(2);
        int[] expectedArray = new int[2];
        expectedArray[0] = 1;
        expectedArray[1] = 2;
        Assertions.assertArrayEquals(expectedArray, array.array);
        array.insert(2);
        Assertions.assertArrayEquals(expectedArray, array.array);
    }

    @Test
    public void shouldInsertElementAtGivenPosition() {
        O00_Array array = new O00_Array(5);
        array.insert(1);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(2, 1);
        array.insert(6, 5);
        int[] expectedArray = new int[5];
        expectedArray[0] = 1;
        expectedArray[1] = 2;
        expectedArray[2] = 3;
        expectedArray[3] = 4;
        expectedArray[4] = 5;
        Assertions.assertArrayEquals(expectedArray, array.array);
    }

    @Test
    public void shouldSearchElementInTheArrayAndReturnIndexIfElementFound() {
        O00_Array array = new O00_Array(5);
        array.insert(1);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(2, 1);
        int actualIndex = array.search(2);
        Assertions.assertEquals(1, actualIndex);
        actualIndex = array.search(5);
        Assertions.assertEquals(4, actualIndex);
        actualIndex = array.search(6);
        Assertions.assertEquals(-1, actualIndex);
    }

    @Test
    public void shouldDeleteElementInArrayF() {
        O00_Array array = new O00_Array(5);
        array.insert(1);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(2, 1);
        array.delete(3);
        array.traverse();
        int[] expectedArray = new int[5];
        expectedArray[0] = 1;
        expectedArray[1] = 2;
        expectedArray[2] = 4;
        expectedArray[3] = 5;
        Assertions.assertArrayEquals(expectedArray, array.array);
    }

    @Test
    public void shouldCheckArrayIsSortedOrNot() {
        O00_Array array = new O00_Array(5);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        boolean actual = array.isSorted();
        Assertions.assertTrue(actual);
        array = new O00_Array(5);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(5);
        array.insert(4);
        actual = array.isSorted();
        Assertions.assertFalse(actual);
    }


}