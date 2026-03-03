package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O28_LongestSubArrayWithEqual0s1sTest {

    @Test
    public void shouldReturnLongestSubArrayLengthWithEqual0s1s() {
        O28_LongestSubArrayWithEqual0s1s longestSubArrayWithEqual0s1s = new O28_LongestSubArrayWithEqual0s1s();
        int actual = longestSubArrayWithEqual0s1s.maxLength(new int[]{1, 0, 1, 1, 1, 0, 0});
        Assertions.assertEquals(6,actual);
        actual = longestSubArrayWithEqual0s1s.maxLength(new int[]{1,1,1,1,1,1,0,0});
        Assertions.assertEquals(4,actual);
        actual = longestSubArrayWithEqual0s1s.maxLength(new int[]{1,1,1,1,0,0,0,0});
        Assertions.assertEquals(8,actual);
    }
}