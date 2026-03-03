package bitwise;

public class O06_KthBitSetOrNot {

    //redid - 1
    public boolean isBitSet(int n, int position) {
        int leftShifted = 1 << position;
        return (n & leftShifted) == leftShifted;
    }
}
