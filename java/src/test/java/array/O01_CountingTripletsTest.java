package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O01_CountingTripletsTest {

    @Test
    public void testCountTripletMethod() {
        O01_CountingTriplets countingTriplets = new O01_CountingTriplets();
        int ans = countingTriplets.countTriplets(new int[]{1, 2, 3, 4, 5}, 5);
        assertEquals(4, ans);
        ans = countingTriplets.countTriplets(new int[]{1, 1, 1, 2, 2}, 5);
        assertEquals(6, ans);
        ans = countingTriplets.countTriplets(new int[]{0, 0, 0}, 3);
        assertEquals(1, ans);
    }

}