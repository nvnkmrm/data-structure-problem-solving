package mathamatics;

import java.util.ArrayList;
import java.util.List;

public class O11_AllDivisorsOfNumber {

    //Redid - 1
    public int[] divisorOfNumberWithoutOrder(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != (n / i)) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors.stream().mapToInt(i -> i).toArray();
    }

    public int[] divisorOfNumberWithOrder(int n) {
        List<Integer> divisors = new ArrayList<>();
        int i;
        for (i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0) {
                divisors.add(n / i);
            }
        }
        return divisors.stream().mapToInt(j -> j).toArray();
    }
}
