package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O32_SmallestPositiveNumberMissingTest {

    @Test
    public void shouldReturnSmallestPositiveNumberMissing() {
        O32_SmallestPositiveNumberMissing smallestPositiveNumberMissing = new O32_SmallestPositiveNumberMissing();
        int actual = smallestPositiveNumberMissing.segregationApproach(new int[]{2, 3, 7, 6, 8, -1, -10, 15});
        Assertions.assertEquals(1, actual);
    }

}