package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O17_MaxConsecutive1sTest {

    @Test
    public void shouldReturnCountOfMaxConsecutive1s() {
        O17_MaxConsecutive1s maxConsecutive1s = new O17_MaxConsecutive1s();
        int actual = maxConsecutive1s.count(new int[]{1, 1, 0, 0, 1, 1, 1});
        Assertions.assertEquals(3, actual);
        actual = maxConsecutive1s.count(new int[]{1});
        Assertions.assertEquals(1, actual);
        actual = maxConsecutive1s.count(new int[]{0});
        Assertions.assertEquals(0, actual);
    }

}