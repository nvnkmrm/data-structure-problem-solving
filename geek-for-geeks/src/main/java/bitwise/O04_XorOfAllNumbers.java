package bitwise;

public class O04_XorOfAllNumbers {

    //Redid - 1
    public int xorAll(int n) {
        int rem = n%4;
        if (rem == 0) {
            return n;
        } else if (rem==1) {
            return 1;
        } else if (rem==2) {
            return n+1;
        }
        return 0;
    }
}
