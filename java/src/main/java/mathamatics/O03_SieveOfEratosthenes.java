package mathamatics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O03_SieveOfEratosthenes {

    //Redid - 5
    public int[] primeNumbers(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers.stream().mapToInt(i -> i).toArray();
    }

}
