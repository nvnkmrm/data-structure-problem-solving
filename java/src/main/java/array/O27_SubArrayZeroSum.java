package array;

import java.util.HashSet;
import java.util.Set;

public class O27_SubArrayZeroSum {

    //redid -2
    public boolean isZeroSumExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int preSum = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            if (preSum == 0 || arr[i] == 0 || set.contains(preSum)) {
                return true;
            }
            set.add(preSum);
        }
        return false;
    }
}
