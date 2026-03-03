package array;

public class O29_ReverseGroupOfSubArray {

    //redid - 2
    public int[] reverseSubArray(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i += k) {
            int left = i,
                    right = Math.min(i + k - 1, n - 1),
                    temp;
            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}
