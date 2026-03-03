package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O10_LeastCommonMultiplesTest {

    @Test
    public void shouldReturnLCMofGivenNumberUsingNaiveSolution(){
        O10_LeastCommonMultiples leastCommonMultiples = new O10_LeastCommonMultiples();
        int actualLcm = leastCommonMultiples.naiveApproach(30, 42);
        assertEquals(210, actualLcm);
        actualLcm = leastCommonMultiples.naiveApproach(30, 36);
        assertEquals(180, actualLcm);
        actualLcm = leastCommonMultiples.naiveApproach(42, 36);
        assertEquals(252, actualLcm);
    }

    @Test
    public void shouldReturnLCMofGivenNumberUsingEfficientSolution(){
        O10_LeastCommonMultiples leastCommonMultiples = new O10_LeastCommonMultiples();
        int actualLcm = leastCommonMultiples.efficientApproach(30, 42);
        assertEquals(210, actualLcm);
        actualLcm = leastCommonMultiples.efficientApproach(30, 36);
        assertEquals(180, actualLcm);
        actualLcm = leastCommonMultiples.efficientApproach(42, 36);
        assertEquals(252, actualLcm);
    }

}