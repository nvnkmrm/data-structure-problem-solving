package bitwise;

public class O01_BitTactics {

    //First Position = 0

    public int setBit(int n, int position) {
        //Step 1: Left shift 1 to given position
        int leftShifted = 1 << position;
        //Step 2: Perform OR operation on leftShifted and n
        return n | leftShifted;
    }
// << 
    public int unSetBit(int n, int position) {
        //Step 1: Left shift 1 to given position
        int leftShifted = 1 << position;
        //Step 2: Flip the bits of left shifted number
        int flipped = ~leftShifted;
        //Step 3: Perform AND operation on 'flipped' and 'n'
        return n & flipped;
    }

    public int toggleBit(int n, int position) {
        //Step 1: Left Shift 1 to given position
        int leftShifted = 1 << position;
        //Step 2: Perform XOR between n and leftShifted
        return (n ^ leftShifted);
    }

    public boolean isSetBitSet(int n, int position) {
        //Step 1: Left Shift 1 to given position
        int leftShifted = 1 << position;
        //Step 2: Perform AND operation on 'leftShifted' and 'n'
        int andPerformed = n & leftShifted;
        //Step 2: Check if andPerformed is equals to leftShifted;
        return andPerformed == leftShifted;
    }

    public int divideByTwo(int n) {
        return n >> 1;
    }

    public int multiplyByTwo(int n) {
        return n << 1;
    }

    public int logBaseTwo(int n) {
        int res = 0;
        while ((n >>= 1) != 0) {
            res++;
        }
        return res;
    }

    public int[] swap(int[] a) {
        a[0] ^=a[1];
        a[1] ^=a[0];
        a[0] ^=a[1];
        return a;
    }
}
