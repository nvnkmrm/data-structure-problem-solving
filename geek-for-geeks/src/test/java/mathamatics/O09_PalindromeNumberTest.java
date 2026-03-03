package mathamatics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class O09_PalindromeNumberTest {
    @Test
    public void shouldReturnTrueForGivenNumber101() {
        O09_PalindromeNumber palindromeNumber = new O09_PalindromeNumber();
        boolean actual = palindromeNumber.isPalindrome(101);
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseForGivenNumber102() {
        O09_PalindromeNumber palindromeNumber = new O09_PalindromeNumber();
        boolean actual = palindromeNumber.isPalindrome(102);
        assertFalse(actual);
    }

    @Test
    public void shouldReturnTrueForGivenNumber0() {
        O09_PalindromeNumber palindromeNumber = new O09_PalindromeNumber();
        boolean actual = palindromeNumber.isPalindrome(0);
        assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueForGivenNumber123456() {
        O09_PalindromeNumber palindromeNumber = new O09_PalindromeNumber();
        boolean actual = palindromeNumber.isPalindrome(123456);
        assertFalse(actual);
    }
}