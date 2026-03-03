package array;

import java.util.Arrays;
import java.util.OptionalInt;

public class O01_CountingTriplets {

    public int countTriplets(int[] arr, int n) {
        int maxValue = Integer.MIN_VALUE;
        OptionalInt s = Arrays.stream(arr).max();
        if (s.isPresent())
            maxValue = s.getAsInt();

        int[] freqArr = new int[maxValue + 1];

        for (int value : arr) {
            freqArr[value]++;
        }

        int tripletCount = 0;

        //Case 1: 0 0 0
        tripletCount += freqArr[0] * (freqArr[0] - 1) * (freqArr[0] - 2) / 6;

        //Case 2: 0 x x
        int i;
        for (i = 1; i <= maxValue; i++) {
            tripletCount += freqArr[0] * freqArr[i] * (freqArr[i] - 1) / 2;
        }

        //Case 3: x x 2*x
        for (i = 1; 2 * i <= maxValue; i++) {
            tripletCount += freqArr[i] * (freqArr[i] - 1) / 2 * freqArr[2 * i];
        }

        //Case 4: x y x+y
        for (i = 1; i <= maxValue; i++) {
            for (int j = i + 1; i + j <= maxValue; j++) {
                tripletCount += freqArr[i] * freqArr[j] * freqArr[i + j];
            }
        }

        return tripletCount;
    }
}
