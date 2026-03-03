package mathamatics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O15_Exactly3Divisors {

    public int[] threeDivisors(int n) {
        //Performing Sieve of Eratosthenes
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        List<Integer> threeDivisorNumber = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                threeDivisorNumber.add(i * i);
            }
        }
        return threeDivisorNumber.stream().mapToInt(i -> i).toArray();
    }

    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //redid - 1
    public int[] threeDivisorsWithO1AuxilliarySpace(int n) {
        List<Integer> threeDivisorNumber = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (isPrime(i)) {
                threeDivisorNumber.add(i * i);
            }
        }
        return threeDivisorNumber.stream().mapToInt(i -> i).toArray();

    }
}
