package bitwise;

/**
 * i/p=> 10011 -> o/p => 1
 * i/p=> 10010 -> o/p => 2
 * i/p=> 10100 -> o/p => 3
 */
public class O12_FirstSetBit {

    //redid - 2
    public int firstBitPosition(int n) {
        if (n == 0) {
            return 0;
        }
        int position = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                return position;
            }
            position++;
            n >>= 1;
        }
        return position;
    }

}
