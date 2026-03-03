package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class O24_CountDistinctWindow {

    //redid - 1
    public int[] countDistinctWindow(int[] arr, int k) {
        ArrayList<Integer> counts = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        counts.add(map.size());
        for (int i = k; i < arr.length; i++) {
            if (map.get(arr[i - k]) == 1) {
                map.remove(arr[i - k]);
            } else {
                map.put(arr[i - k], map.get(arr[i - k]) - 1);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            counts.add(map.size());
        }
        return counts.stream().mapToInt(i -> i).toArray();
    }
}
