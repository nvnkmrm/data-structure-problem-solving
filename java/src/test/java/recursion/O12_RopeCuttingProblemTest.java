package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O12_RopeCuttingProblemTest {

    @Test
    public void shouldReturnRopeMaxPiecesForGivenArgument() {
        O12_RopeCuttingProblem ropeCuttingProblem = new O12_RopeCuttingProblem();
        int actual = ropeCuttingProblem.maxPieces(5, 2, 5, 1);
        Assertions.assertEquals(5, actual);
        actual = ropeCuttingProblem.maxPieces(23, 12, 9, 11);
        Assertions.assertEquals(2, actual);
        actual = ropeCuttingProblem.maxPieces(5, 4, 2, 6);
        Assertions.assertEquals(-1, actual);
    }

}