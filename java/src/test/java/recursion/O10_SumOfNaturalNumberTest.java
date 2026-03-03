package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O10_SumOfNaturalNumberTest {

    @Test
    public void shouldReturnSumOfNaturalNumberUsingRecursion() {
        O10_SumOfNaturalNumber sumOfNaturalNumber = new O10_SumOfNaturalNumber();
        int actual = sumOfNaturalNumber.sumUsingRecursion(2);
        Assertions.assertEquals(3, actual);
        actual = sumOfNaturalNumber.sumUsingRecursion(4);
        Assertions.assertEquals(10, actual);
        actual = sumOfNaturalNumber.sumUsingRecursion(5);
        Assertions.assertEquals(15, actual);
    }

    @Test
    public void shouldReturnSumOfNaturalNumberUsingFormula() {
        O10_SumOfNaturalNumber sumOfNaturalNumber = new O10_SumOfNaturalNumber();
        int actual = sumOfNaturalNumber.sumUsingFormula(2);
        Assertions.assertEquals(3, actual);
        actual = sumOfNaturalNumber.sumUsingFormula(4);
        Assertions.assertEquals(10, actual);
        actual = sumOfNaturalNumber.sumUsingFormula(5);
        Assertions.assertEquals(15, actual);
    }

}