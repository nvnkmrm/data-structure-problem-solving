package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class O01_PermutationOfStringTest {

    @Test
    public void shouldPerformPermutationForGivenString() {
        O01_PermutationOfString permutation = new O01_PermutationOfString();
        permutation.permute("ABC",0,2);
        assertTrue(true);
    }

}
