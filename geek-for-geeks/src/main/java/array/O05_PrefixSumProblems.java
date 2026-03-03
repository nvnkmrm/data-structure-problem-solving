package array;

public class O05_PrefixSumProblems {

    //redid - 2
    public int[] prefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }


    //redid - 2
    public int sumInRange(int[] arr, int start, int end) {
        int[] prefixSum = prefixSum(arr);
        if (start == 0) {
            return prefixSum[end];
        } else {
            return prefixSum[end] - prefixSum[start - 1];
        }
    }

    // redid - 2
    public int maxSumAfterMAdditionOfGivenRange(int arraySize, int numberToBeAdded, int m, int[] start, int[] end) {
        int[] additionArray = new int[arraySize];
        for (int i = 0; i < m; i++) {
            additionArray[start[i]] += numberToBeAdded;
            if (end[i] < (arraySize - 1)) {
                additionArray[end[i] + 1] -= numberToBeAdded;
            }
        }
        int maxSum = additionArray[0];
        int[] prefixSum = prefixSum(additionArray);
        for (int i = 1; i < arraySize; i++) {
            if (prefixSum[i] > maxSum) {
                maxSum = prefixSum[i];
            }
        }
        return maxSum;
    }
}
