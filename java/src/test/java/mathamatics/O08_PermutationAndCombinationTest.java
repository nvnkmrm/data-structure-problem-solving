package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class O08_PermutationAndCombinationTest {

    private final O08_PermutationAndCombination permutationAndCombination = new O08_PermutationAndCombination();

    @Test
    public void shouldReturnPermutationOfGivenNumber() {
        assertEquals(permutationAndCombination.permutation(5, 5), 120);
        assertEquals(permutationAndCombination.permutation(5, 0), 1);
    }

    @Test
    public void shouldReturnCombinationOfGivenNumber() {
        assertEquals(permutationAndCombination.combination(5, 0), 1);
        assertEquals(permutationAndCombination.combination(5, 5), 1);
        assertEquals(permutationAndCombination.combination(5, 3),
                permutationAndCombination.combination(5, 5-3));
    }

}