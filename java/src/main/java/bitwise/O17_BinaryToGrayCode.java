package bitwise;

public class O17_BinaryToGrayCode {

    // redid - 1
    public int convert(int n) {
        if (n == 0) {
            return 0;
        }
        int msbPosition = (int) Math.floor(Math.log(n) / Math.log(2));
        int msb = 1 << msbPosition;
        int rightShifted = n >> 1;
        int xor = n ^ rightShifted;
        return msb | xor;
    }
}
