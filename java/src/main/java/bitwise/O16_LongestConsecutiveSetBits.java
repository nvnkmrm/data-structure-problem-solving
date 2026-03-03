package bitwise;

public class O16_LongestConsecutiveSetBits {

    //redid - 2
    public int countLongestConsecutiveSetBits(int n) {
        int count = 0;
        int longestSetBit = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            } else {
                count = 0;
            }
            if (count > longestSetBit) {
                longestSetBit = count;
            }
            n >>= 1;
        }
        return longestSetBit;
    }
}
