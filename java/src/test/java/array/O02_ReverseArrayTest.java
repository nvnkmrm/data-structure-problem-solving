package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class O02_ReverseArrayTest {

    private final O02_ReverseArray reverseArray = new O02_ReverseArray();

    @Test
    public void shouldPerformReverseOperationForPassedArray() {
        char[] passedArray = new char[]{'a', 'b', 'c', 'd'};
        char[] expectedArray = new char[]{'d', 'c', 'b', 'a'};
        reverseArray.reverse(passedArray,0,passedArray.length-1);
        assertArrayEquals(expectedArray, passedArray);
    }

    @Test
    public void shouldPerformReverseOperationWhenArrayLengthAsOdd() {
        char[] passedArray = new char[]{'a', 'b', 'c'};
        char[] expectedArray = new char[]{'c', 'b', 'a'};
        reverseArray.reverse(passedArray, 0, passedArray.length - 1);
        assertArrayEquals(expectedArray, passedArray);
    }

    @Test
    public void shouldReverseForEmptyAndSingleArray() {
        char[] passedArray = new char[]{};
        char[] expectedArray = new char[]{};
        reverseArray.reverse(passedArray, 0, passedArray.length - 1);
        assertArrayEquals(expectedArray, passedArray);
        passedArray = new char[]{'a'};
        expectedArray = new char[]{'a'};
        reverseArray.reverse(passedArray, 0, passedArray.length - 1);
        assertArrayEquals(expectedArray, passedArray);
    }


}
