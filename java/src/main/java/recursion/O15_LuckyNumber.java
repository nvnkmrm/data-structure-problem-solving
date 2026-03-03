package recursion;

public class O15_LuckyNumber {

    public boolean isLuckyNumber(int n) {
        return isLuckyNumber(n, 2);
    }

    //redid -2
    private boolean isLuckyNumber(int position, int iteration) {
        if (position < iteration) {
            return true;
        }
        if (position % iteration == 0) {
            return false;
        }
        int nextPosition = position - position / iteration;
        return isLuckyNumber(nextPosition, ++iteration);
    }
}
