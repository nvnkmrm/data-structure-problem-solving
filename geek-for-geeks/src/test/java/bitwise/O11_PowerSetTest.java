package bitwise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class O11_PowerSetTest {

    @Test
    public void shouldGeneratePowerSetOfGivenString() {
        O11_PowerSet powerSet = new O11_PowerSet();
        String[] actual = powerSet.powerSetOfString("abc");
        String[] expected = {"", "a", "b", "c", "ab", "ac", "bc", "abc"};
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
        actual = powerSet.powerSetOfString("ab");
        expected = new String[]{"", "a", "b", "ab"};
        Arrays.sort(actual);
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
    }

}