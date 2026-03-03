package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O21_MinimumConsecutiveFlipsTest {

    @Test
    public void shouldReturnMinimumConsecutiveFlipsInBinaryArray() {
        O21_MinimumConsecutiveFlips minimumConsecutiveFlips = new O21_MinimumConsecutiveFlips();
        String actual = minimumConsecutiveFlips.minimumFlips(new int[]{1, 1, 0, 0, 0, 1});
        Assertions.assertEquals("From 2 to 4", actual);
        actual = minimumConsecutiveFlips.minimumFlips(new int[]{1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1});
        Assertions.assertEquals("From 1 to 3 From 5 to 6", actual);
        actual = minimumConsecutiveFlips.minimumFlips(new int[]{1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0});
        Assertions.assertEquals("From 1 to 3 From 5 to 6 From 10 to 10", actual);
    }

}