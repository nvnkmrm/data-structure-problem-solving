package bitwise;

public class O18_GrayToBinary {

    //redid - 1
    public int convert(int n) {
        if (n == 0) {
            return 0;
        }
        int msbPosition = (int) Math.floor(Math.log(n) / Math.log(2));
        int binary = 1 << msbPosition;
        int lastXor = 1;
        for (int i = msbPosition - 1; i >= 0; i--) {
            if ((n & (1 << i)) != 0) {
                lastXor ^= 1;
            } else {
                lastXor ^= 0;
            }
            binary |= lastXor << i;
        }
        return binary;
    }
}
