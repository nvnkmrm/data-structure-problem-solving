package mathamatics;

public class O04_GreatestCommonDivisor {

    //Redid - 2
    public int optimizedEuclideanApproach(int a, int b) {
        if (a == 0) {
            return b;
        }
        return optimizedEuclideanApproach(b % a, a);
    }

    public int lcm(int a, int b) {
        return (a * b) / optimizedEuclideanApproach(a, b);
    }

    //Redid - 1
    public int gcdNaiveSolution(int a, int b) {
        int res = Math.min(a, b);
        while (res > 1) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    public int euclideanApproach(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
