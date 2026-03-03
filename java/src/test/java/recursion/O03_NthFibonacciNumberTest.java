package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class O03_NthFibonacciNumberTest {

    @Test
    public void shouldReturnNthFibonacciNumber() {
        O03_NthFibonacciNumber nthFibonacciNumber = new O03_NthFibonacciNumber();
        nthFibonacciNumber.fibonacci(5);
        assertTrue(true);
    }

    @Test
    public void shouldReturn5For5thFibonacciNumber() {
        O03_NthFibonacciNumber nthFibonacciNumber = new O03_NthFibonacciNumber();
        int n = nthFibonacciNumber.fibonacci(5);
        assertEquals(5, n);
    }

    @Test
    public void shouldReturn8For6thFibonacciNumber() {
        O03_NthFibonacciNumber nthFibonacciNumber = new O03_NthFibonacciNumber();
        int n = nthFibonacciNumber.fibonacci(6);
        assertEquals(8, n);
    }

    @Test
    public void shouldReturn5For5thFibonacciNumberUsingMemoization() {
        O03_NthFibonacciNumber nthFibonacciNumber = new O03_NthFibonacciNumber();
        int n = nthFibonacciNumber.fibWithMemo(5);
        assertEquals(5, n);
    }

    @Test
    public void shouldReturn8For6thFibonacciNumberUsingMemoization() {
        O03_NthFibonacciNumber nthFibonacciNumber = new O03_NthFibonacciNumber();
        int n = nthFibonacciNumber.fibWithMemo(6);
        assertEquals(8, n);
    }

}
