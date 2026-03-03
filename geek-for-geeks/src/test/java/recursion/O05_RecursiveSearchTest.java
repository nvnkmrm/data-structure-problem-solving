package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class O05_RecursiveSearchTest {

    @Test
    public void shouldSearchForGivenElementInArray() {
        O05_RecursiveSearch recursiveSearch = new O05_RecursiveSearch();
        boolean isFound = recursiveSearch.search(new int[]{1, 2, 3, 4, 5, 6}, 2);
        assertTrue(isFound);
        isFound = recursiveSearch.search(new int[]{4, 5, 6}, 7);
        assertFalse(isFound);
        isFound = recursiveSearch.search(new int[]{1, 2, 3, 4, 5, 6}, 6);
        assertTrue(isFound);
        isFound = recursiveSearch.search(new int[]{1}, 1);
        assertTrue(isFound);
        isFound = recursiveSearch.search(new int[]{1}, 0);
        assertFalse(isFound);
    }

}