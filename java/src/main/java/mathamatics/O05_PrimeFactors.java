package mathamatics;

import java.util.ArrayList;
import java.util.List;

public class O05_PrimeFactors {

    public int[] primeFactorNaiveSolution(int n) {
        List<Integer> primeFactorList = new ArrayList<>();
        O02_PrimeNumber primeNumber = new O02_PrimeNumber();
        for (int i = 2; i < n; i++) {
            if (primeNumber.isPrimeNumberMoreEfficient(i)) {
                int x = i;
                while (n % x == 0) {
                    primeFactorList.add(i);
                    x = x * i;
                }
            }
        }
        return primeFactorList.stream().mapToInt(i -> i).toArray();
    }

    //Redid - 1
    public int[] primeFactorMoreEfficientSolution(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        if (n <= 1) {
            return new int[]{};
        }
        if (n % 2 == 0) {
            while (n % 2 == 0) {
                primeFactors.add(2);
                n = n / 2;
            }
        }
        if (n % 3 == 0) {
            while (n % 3 == 0) {
                primeFactors.add(3);
                n = n / 3;
            }
        }
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n = n / i;
                    primeFactors.add(i);
                }
            }
            if (n % (i + 2) == 0) {
                while (n % (i = 2) == 0) {
                    n = n / (i + 2);
                    primeFactors.add(i + 2);
                }
            }
        }

        if (n > 3) {
            primeFactors.add(n);
        }
        return primeFactors.stream().mapToInt(i -> i).toArray();
    }

    public int[] getPrimeFactor(int n) {
        List<Integer> primeFactorList = new ArrayList<>();
        if (n % 2 == 0) {
            while (n % 2 == 0) {
                primeFactorList.add(2);
                n = n / 2;
            }
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                primeFactorList.add(i);
                n = n / i;
            }
        }
        if (n > 2) {
            primeFactorList.add(n);
        }
        return primeFactorList.stream().mapToInt(i -> i).toArray();
    }
}
