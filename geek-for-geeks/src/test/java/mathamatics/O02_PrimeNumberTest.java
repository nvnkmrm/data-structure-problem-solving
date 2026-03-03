package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class O02_PrimeNumberTest {

    @Test
    public void shouldDetermineWhetherGivenNumberIsPrimeOrNot() {
        O02_PrimeNumber primeNumber = new O02_PrimeNumber();
        boolean isPrime = primeNumber.isPrimeNumber(2);
        assertTrue(isPrime);
        isPrime = primeNumber.isPrimeNumber(3);
        assertTrue(isPrime);
        isPrime = primeNumber.isPrimeNumber(6);
        assertFalse(isPrime);
        isPrime = primeNumber.isPrimeNumber(7);
        assertTrue(isPrime);
        isPrime = primeNumber.isPrimeNumber(11);
        assertTrue(isPrime);
    }

    @Test
    public void shouldDetermineWhetherGivenNumberIsPrimeOrNotMoreEfficient() {
        O02_PrimeNumber primeNumber = new O02_PrimeNumber();
        boolean isPrime = primeNumber.isPrimeNumberMoreEfficient(2);
        assertTrue(isPrime);
        isPrime = primeNumber.isPrimeNumberMoreEfficient(3);
        assertTrue(isPrime);
        isPrime = primeNumber.isPrimeNumberMoreEfficient(6);
        assertFalse(isPrime);
        isPrime = primeNumber.isPrimeNumberMoreEfficient(7);
        assertTrue(isPrime);
        isPrime = primeNumber.isPrimeNumberMoreEfficient(11);
        assertTrue(isPrime);
    }

}