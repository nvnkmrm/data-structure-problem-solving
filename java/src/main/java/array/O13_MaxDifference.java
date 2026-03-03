package array;

public class O13_MaxDifference {

    //redid - 3
    public int findMaxDifference(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return Integer.MIN_VALUE;
        }
        int minValue = arr[0];
        int res = arr[1] - arr[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res, arr[i] - minValue);
            minValue = Math.min(minValue, arr[i]);
        }
        return res;
    }
}
