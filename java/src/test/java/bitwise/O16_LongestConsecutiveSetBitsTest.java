package bitwise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O16_LongestConsecutiveSetBitsTest {

    @Test
    public void shouldReturnLongestConsecutive1sInGivenNumber() {
        O16_LongestConsecutiveSetBits longestConsecutiveSetBits = new O16_LongestConsecutiveSetBits();
        int actual = longestConsecutiveSetBits.countLongestConsecutiveSetBits(14);
        Assertions.assertEquals(3,actual);
        actual = longestConsecutiveSetBits.countLongestConsecutiveSetBits(222);
        Assertions.assertEquals(4,actual);
    }

}