package array;

/**
 * Given an array of integers of size 'n'.
 * Our aim is to calculate the maximum sum of 'k'
 * consecutive elements in the array.
 * Input  : arr[] = {100, 200, 300, 400}
 * k = 2
 * Output : 700
 */
public class O04_SlidingWindow {

    //redid - 2
    public int maxSumOfKElements(int[] arr, int k) {
        int n = arr.length;
        int currSum = 0, i;
        if (k > n) {
            return Integer.MIN_VALUE;
        }
        for (i = 0; i < k; i++) {
            currSum += arr[i];
        }
        int maxSum = currSum;
        for (; i < n; i++) {
            currSum = currSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
