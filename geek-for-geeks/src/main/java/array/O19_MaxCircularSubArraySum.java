package array;

public class O19_MaxCircularSubArraySum {

    public int maxCircularSubArraySumUsingNaiveSolution(int[] arr) {
        int n = arr.length;
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int currSum = arr[i];
            int currMax = arr[i];
            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;
                currSum += arr[index];
                currMax = Math.max(currMax, currSum);
            }
            res = Math.max(res, currMax);
        }
        return res;
    }

    public int kadenceAlgorithm(int[] arr) {
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public int maxCircularSubArraySumUsingEfficientSolution(int[] arr) {
        int maxNormal = kadenceAlgorithm(arr);
        if (maxNormal < 0) {
            return 0;
        }
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = arrSum + kadenceAlgorithm(arr);
        return Math.max(maxNormal, maxCircular);
    }
}
