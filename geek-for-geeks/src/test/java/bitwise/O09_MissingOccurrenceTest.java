package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O09_MissingOccurrenceTest {

    @Test
    public void shouldReturnTheMissingOccurrenceInGivenSequence() {
        O09_MissingOccurrence missingOccurrence = new O09_MissingOccurrence();
        int actual = missingOccurrence.findMissingOccurrence(new int[]{1, 3, 4});
        assertEquals(2, actual);
        actual = missingOccurrence.findMissingOccurrence(new int[]{1});
        assertEquals(2, actual);
        actual = missingOccurrence.findMissingOccurrence(new int[]{1,2,3});
        assertEquals(4, actual);
    }
}