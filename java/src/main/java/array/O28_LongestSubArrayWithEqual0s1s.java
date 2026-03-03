package array;

import java.util.HashMap;
import java.util.Map;

public class O28_LongestSubArrayWithEqual0s1s {

    //redid - 1
    public int maxLength(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length,
                maxLength = -1,
                sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] == 0 ? -1 : 1;
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLength = i + 1;
            }
            if (map.containsKey(sum)) {
                if (maxLength < i - map.get(sum)) {
                    maxLength = i - map.get(sum);
                }
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}
