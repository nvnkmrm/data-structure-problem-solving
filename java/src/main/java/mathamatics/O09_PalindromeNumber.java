package mathamatics;

public class O09_PalindromeNumber {

    //Redid - 4
    public boolean isPalindrome(int n) {
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        return temp == sum;
    }
}
