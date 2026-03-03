package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class O02_AllPermutationOfStringTest {

    @Test
    public void shouldGenerateAllPermutationOfString() {
        O02_AllPermutationOfString allPermutationOfString = new O02_AllPermutationOfString();
        allPermutationOfString.permute("ABC");
        assertTrue(true);
    }

}
