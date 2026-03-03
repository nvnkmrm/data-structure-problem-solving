package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class O03_SieveOfEratosthenesTest {

    @Test
    public void shouldReturnListOfPrimeNumberWithinGivenNumber() {
        O03_SieveOfEratosthenes sieveOfEratosthenes = new O03_SieveOfEratosthenes();
        int[] expectedPrimeNumbers = {2, 3, 5, 7, 11, 13};
        int[] actualPrimeNumbers = sieveOfEratosthenes.primeNumbers(15);
        assertArrayEquals(expectedPrimeNumbers, actualPrimeNumbers);
        expectedPrimeNumbers = new int[]{2};
        actualPrimeNumbers = sieveOfEratosthenes.primeNumbers(2);
        assertArrayEquals(expectedPrimeNumbers, actualPrimeNumbers);
        expectedPrimeNumbers = new int[]{};
        actualPrimeNumbers = sieveOfEratosthenes.primeNumbers(1);
        assertArrayEquals(expectedPrimeNumbers, actualPrimeNumbers);
        expectedPrimeNumbers = new int[]{2, 3, 5};
        actualPrimeNumbers = sieveOfEratosthenes.primeNumbers(5);
        assertArrayEquals(expectedPrimeNumbers, actualPrimeNumbers);
    }

}