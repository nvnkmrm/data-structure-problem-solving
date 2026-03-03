package bitwise;

public class O02_PowerOfTwo {

    public boolean naiveSolution(int n) {
        if (n <= 1) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n >>= 1;
        }
        return true;
    }

    //Redid - 4
    public boolean isPowerOfTwo(int n) {
      if (n == 0){
        return false;
      }
      return (n & (n - 1)) == 0;
    }
}
