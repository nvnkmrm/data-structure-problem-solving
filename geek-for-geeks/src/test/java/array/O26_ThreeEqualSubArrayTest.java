package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O26_ThreeEqualSubArrayTest {

    @Test
    public void shouldReturnIndexPairOfEqualSplit() {
        O26_ThreeEqualSubArray threeEqualSubArray = new O26_ThreeEqualSubArray();
        String actual = threeEqualSubArray.findSplit(new int[]{1, 3, 4, 0, 4});
        Assertions.assertEquals("1, 3", actual);
    }

}