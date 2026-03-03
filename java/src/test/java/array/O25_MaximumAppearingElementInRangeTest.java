package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O25_MaximumAppearingElementInRangeTest {

    @Test
    public void shouldReturnTheMaxAppearingElementInGivenRange() {
        O25_MaximumAppearingElementInRange maximumAppearingElementInRange = new O25_MaximumAppearingElementInRange();
        int actual = maximumAppearingElementInRange.maximumAppearingElementInGivenRange(new int[]{0, 1, 0}, new int[]{1, 2, 3});
        Assertions.assertEquals(1, actual);
        actual = maximumAppearingElementInRange.maximumAppearingElementInGivenRange(new int[]{1, 5, 4}, new int[]{5, 10, 6});
        Assertions.assertEquals(5, actual);
        actual = maximumAppearingElementInRange.maximumAppearingElementInGivenRange(new int[]{1,1,1}, new int[]{1,1,1});
        Assertions.assertEquals(1, actual);
    }

}