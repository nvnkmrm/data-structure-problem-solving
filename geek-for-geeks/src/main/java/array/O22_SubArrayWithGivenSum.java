package array;

public class O22_SubArrayWithGivenSum {

    public boolean subArraySum(int[] arr, int sum) {
        int n = arr.length;
        int startIndex = 0;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            while (currSum > sum && startIndex <= i) {
                currSum -= arr[startIndex++];
            }
            if (currSum == sum) {
                return true;
            }
        }
        return false;
    }
}
