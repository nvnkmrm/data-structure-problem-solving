package recursion;

import bitwise.O11_PowerSet;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class O07_PowerSetTest {

    @Test
    public void shouldGeneratePowerSetOfGivenString() {
        O07_PowerSet powerSet = new O07_PowerSet();
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