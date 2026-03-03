package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O20_MajorityElementTest {

    @Test
    public void shouldReturnMajorityElementUsingNaiveSolution() {
        O20_MajorityElement majorityElement = new O20_MajorityElement();
        int actual = majorityElement.findMajorityUsingNaiveSolution(new int[]{1, 2, 1, 1});
        Assertions.assertEquals(0, actual);
        actual = majorityElement.findMajorityUsingNaiveSolution(new int[]{1, 2, 3});
        Assertions.assertEquals(-1, actual);
        actual = majorityElement.findMajorityUsingNaiveSolution(new int[]{2, 3, 4, 4, 5, 5, 5, 5, 5});
        Assertions.assertEquals(4, actual);
    }

    @Test
    public void shouldReturnMajorityElementUsingMorrisVotingAlgorithm() {
        O20_MajorityElement majorityElement = new O20_MajorityElement();
        int actual = majorityElement.findMajorityUsingMorrisVotingAlgorithm(new int[]{1, 2, 1, 1});
        Assertions.assertEquals(2, actual);
        actual = majorityElement.findMajorityUsingMorrisVotingAlgorithm(new int[]{1, 2, 3});
        Assertions.assertEquals(-1, actual);
        actual = majorityElement.findMajorityUsingMorrisVotingAlgorithm(new int[]{2, 3, 4, 4, 5, 5, 5, 5, 5});
        Assertions.assertEquals(5, actual);
    }

}