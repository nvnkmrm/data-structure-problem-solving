package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O06_EquilibriumIndexTest {

    @Test
    public void shouldReturnEqIndexOfGivenArray() {
        O06_EquilibriumIndex equilibriumIndex = new O06_EquilibriumIndex();
        int actual = equilibriumIndex.eqIndex(new int[]{-7, 1, 5, 2, -4, 3, 0});
        assertEquals(3, actual);
        actual = equilibriumIndex.eqIndex(new int[]{1, 2, 3, 4, 3, 3});
        assertEquals(3, actual);
        actual = equilibriumIndex.eqIndex(new int[]{5, 1, 1, 1, 1, 1, 1});
        assertEquals(1, actual);
        actual = equilibriumIndex.eqIndex(new int[]{1, 2, 4, 5, 6});
        assertEquals(-1, actual);
    }
}