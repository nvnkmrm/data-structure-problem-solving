package array;

public class O06_EquilibriumIndex {

    //redid - 2
    public int eqIndex(int[] arr) {
        int n = arr.length,
                sum = 0,
                leftSum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (sum == leftSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
