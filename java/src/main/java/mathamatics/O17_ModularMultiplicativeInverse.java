package mathamatics;

public class O17_ModularMultiplicativeInverse {

    public int modularMultiplicativeInverse(int a, int m) {
        for (int i =1;i<m;i++) {
            if ((a*i)%m==1) {
                return i;
            }
        }
        return -1;
    }
}
