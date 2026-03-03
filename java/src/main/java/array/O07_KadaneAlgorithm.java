package array;

public class O07_KadaneAlgorithm {

    public int maxSubArraySumUsingNaiveSolution(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                curr += arr[j];
                res = Math.max(curr, res);
            }
            System.out.println(i + " => " + res);
        }
        return res;
    }

    //redid - 7
    public int largestSumSubArray(int[] arr) {
        int n = arr.length,
                result = arr[0],
                maxEnding = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            result = Math.max(maxEnding, result);
        }
        return result;
    }
}
