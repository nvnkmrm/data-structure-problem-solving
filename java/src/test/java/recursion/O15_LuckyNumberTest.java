package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O15_LuckyNumberTest {

    @Test
    public void shouldReturnTrueIfGivenNumberIsLuckyFalseOtherwise() {
        O15_LuckyNumber luckyNumber = new O15_LuckyNumber();
        boolean actual = luckyNumber.isLuckyNumber(13);
        Assertions.assertTrue(actual);
        actual = luckyNumber.isLuckyNumber(1);
        Assertions.assertTrue(actual);
        actual = luckyNumber.isLuckyNumber(3);
        Assertions.assertTrue(actual);
        actual = luckyNumber.isLuckyNumber(5);
        Assertions.assertFalse(actual);
    }

}