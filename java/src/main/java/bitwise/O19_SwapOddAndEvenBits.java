package bitwise;

public class O19_SwapOddAndEvenBits {

    //redid - 1
    public int swap(int n) {
        int oddBits = n & 0xAAAAAAAA;
        int rsOddBits = oddBits >> 1;
        int evenBits = n & 0x55555555;
        int lsEvenBits = evenBits << 1;
        return rsOddBits | lsEvenBits;
    }
}
