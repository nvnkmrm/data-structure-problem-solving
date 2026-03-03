package mathamatics;

public class O10_LeastCommonMultiples {

    public int naiveApproach(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0) {
                break;
            }
            res++;
        }
        return res;
    }

    public int efficientApproach(int a, int b) {
        O04_GreatestCommonDivisor gcd = new O04_GreatestCommonDivisor();
        return a*b/gcd.optimizedEuclideanApproach(a,b);
    }
}
