package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O04_GreatestCommonDivisorTest {

    @Test
    public void shouldReturnGcdOfGivenTwoNumbersUsingNaiveApproach() {
        O04_GreatestCommonDivisor greatestCommonDivisor = new O04_GreatestCommonDivisor();
        int actualGcd = greatestCommonDivisor.gcdNaiveSolution(30, 42);
        assertEquals(6, actualGcd);
        actualGcd = greatestCommonDivisor.gcdNaiveSolution(30, 36);
        assertEquals(6, actualGcd);
        actualGcd = greatestCommonDivisor.gcdNaiveSolution(42, 36);
        assertEquals(6, actualGcd);
    }

    @Test
    public void shouldReturnGcdOfGivenTwoNumbersUsingOptimizedEuclidean() {
        O04_GreatestCommonDivisor greatestCommonDivisor = new O04_GreatestCommonDivisor();
        int actualGcd = greatestCommonDivisor.optimizedEuclideanApproach(30, 42);
        assertEquals(6, actualGcd);
        actualGcd = greatestCommonDivisor.optimizedEuclideanApproach(30, 36);
        assertEquals(6, actualGcd);
        actualGcd = greatestCommonDivisor.optimizedEuclideanApproach(42, 36);
        assertEquals(6, actualGcd);
    }

    @Test
    public void shouldReturnGcdOfGivenTwoNumbersUsingEuclidean() {
        O04_GreatestCommonDivisor greatestCommonDivisor = new O04_GreatestCommonDivisor();
        int actualGcd = greatestCommonDivisor.euclideanApproach(30, 42);
        assertEquals(6, actualGcd);
        actualGcd = greatestCommonDivisor.euclideanApproach(30, 36);
        assertEquals(6, actualGcd);
        actualGcd = greatestCommonDivisor.euclideanApproach(42, 36);
        assertEquals(6, actualGcd);
    }

    @Test
    public void shouldReturnLcmOfGivenTwoNumbers() {
        O04_GreatestCommonDivisor greatestCommonDivisor = new O04_GreatestCommonDivisor();
        int actualLcm = greatestCommonDivisor.lcm(30, 42);
        assertEquals(210, actualLcm);
        actualLcm = greatestCommonDivisor.lcm(30, 36);
        assertEquals(180, actualLcm);
        actualLcm = greatestCommonDivisor.lcm(42, 36);
        assertEquals(252, actualLcm);
    }

}