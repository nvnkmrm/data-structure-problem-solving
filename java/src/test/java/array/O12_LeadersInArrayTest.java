package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O12_LeadersInArrayTest {

    @Test
    public void shouldReturnLeadersInArray() {
        O12_LeadersInArray leadersInArray = new O12_LeadersInArray();
        int[] actual = leadersInArray.leadersInArray(new int[]{3, 2, 1});
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, actual);
        actual = leadersInArray.leadersInArray(new int[]{3, 5, 1});
        Assertions.assertArrayEquals(new int[]{1, 5}, actual);
    }
}