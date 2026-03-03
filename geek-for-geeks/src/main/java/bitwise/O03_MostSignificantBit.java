package bitwise;

public class O03_MostSignificantBit {
    //Redid - 4
    public int msb(int n) {
        int msb = (int) Math.floor(Math.log(n) / Math.log(2));
        return (int) Math.pow(2, msb);
    }
}
