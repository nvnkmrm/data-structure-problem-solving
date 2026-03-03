package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O08_JoesphusTest {

    @Test
    public void shouldReturnSurvivingPosition() {
        O08_Joesphus joesphus = new O08_Joesphus();
        int actual = joesphus.survivingPosition(5, 2);
        Assertions.assertEquals(3, actual);
        actual = joesphus.survivingPosition(14, 2);
        Assertions.assertEquals(13, actual);
        actual = joesphus.survivingPosition(7, 3);
        Assertions.assertEquals(4, actual);
    }

}