package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class O06_PalindromeTest {

    @Test
    public void shouldReturnTrueIfGivenStringIsPalindrome() {
        O06_Palindrome palindrome = new O06_Palindrome();
        boolean actual = palindrome.isPalindrome("malayalam");
        Assertions.assertTrue(actual);
        actual = palindrome.isPalindrome("aa");
        Assertions.assertTrue(actual);
        actual = palindrome.isPalindrome("a");
        Assertions.assertTrue(actual);
        actual = palindrome.isPalindrome("abcdba");
        Assertions.assertFalse(actual);
    }
}