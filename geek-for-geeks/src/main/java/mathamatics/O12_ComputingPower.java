package mathamatics;

public class O12_ComputingPower {

    //Redid - 3
    public int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = pow(x, (n >> 1));
        temp = temp * temp;
        if ((n & 1) == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }
}
