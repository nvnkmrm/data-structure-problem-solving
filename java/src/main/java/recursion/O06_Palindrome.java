package recursion;

public class O06_Palindrome {

    public boolean isPalindrome(String str) {
        return isPalindrome(str.toCharArray(), 0, str.length() - 1);
    }

    //redid - 2
    public boolean isPalindrome(char[] str, int start, int end) {
        if (start == end) {
            return true;
        }
        if (str[start] != str[end]) {
            return false;
        }
        if (start < end) {
            return isPalindrome(str, start + 1, end - 1);
        }
        return true;
    }
}
