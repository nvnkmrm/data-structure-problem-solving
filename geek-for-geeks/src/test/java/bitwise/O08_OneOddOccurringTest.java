package bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O08_OneOddOccurringTest {

    @Test
    public void shouldOneOccurringElementInGivenArrayUsingNaiveSolution() {
        O08_OneOddOccurring oneOddOccurring = new O08_OneOddOccurring();
        int actual = oneOddOccurring.naiveSolution(new int[]{4,5,4,4,4,2,3,2,3});
        assertEquals(5,actual);
        actual = oneOddOccurring.naiveSolution(new int[]{4,4,4,4,2,3,2,3});
        assertEquals(-1,actual);
    }

    @Test
    public void shouldOneOccurringElementInGivenArrayUsingEfficientSolution() {
        O08_OneOddOccurring oneOddOccurring = new O08_OneOddOccurring();
        int actual = oneOddOccurring.efficientSolution(new int[]{5,4,4,4,4,2,3,2,3});
        assertEquals(5,actual);
        actual = oneOddOccurring.efficientSolution(new int[]{4,4,4,4,2,3,2,3,6});
        assertEquals(6,actual);
    }


}